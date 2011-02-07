package org.codefromhell.recipesapp.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codefromhell.recipesapp.model.Recipe;
import org.codefromhell.recipesapp.model.RecipeFileItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecipeManager implements Serializable {
    private static final long serialVersionUID = 5L;
    
    public Recipe getRecipe(String apiUrl, String user, String repo, String hash) {
        Recipe recipe = null;
        try {

            StringBuilder recipeData = new StringBuilder();

            URL url = new URL(apiUrl + "/" + user + "/" + repo + "/" + hash);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                recipeData.append(line);
            }
            reader.close();

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Recipe.class, new RecipeCreator());
            Gson gson =  gsonBuilder.create();
            recipe = gson.fromJson(recipeData.toString(), Recipe.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipe;
    }

    public List<RecipeFileItem> getRecipeIds(String apiUrl, String user, String repo, String branch) {
        List<RecipeFileItem> recipes = new ArrayList<RecipeFileItem>();

        try {
            StringBuilder recipeListData = new StringBuilder();

            URL url = new URL(apiUrl + "/" + user + "/" + repo + "/" + branch);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                recipeListData.append(line);
            }
            reader.close();

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(IntermediateRecipeList.class, new IntermediateRecipeListCreator());
            Gson gson =  gsonBuilder.create();
            IntermediateRecipeList rlObject = gson.fromJson(recipeListData.toString(), IntermediateRecipeList.class);

            for (String key : rlObject.getBlobs().keySet()) {
                if (key.endsWith(".json") && key.startsWith("recipes/")) {
                    recipes.add(new RecipeFileItem(rlObject.getBlobs().get(key), key));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipes;
    }

    public class IntermediateRecipeList{
        private HashMap<String, String> blobs;

        public HashMap<String, String> getBlobs() {
            return blobs;
        }

        public void setBlobs(HashMap<String, String> blobs) {
            this.blobs = blobs;
        }

        public IntermediateRecipeList() {

        };
    }

    private class IntermediateRecipeListCreator implements InstanceCreator<IntermediateRecipeList>, Serializable {
        public IntermediateRecipeList createInstance(Type type) {
            return new IntermediateRecipeList();
        }
    }

    private class RecipeCreator implements InstanceCreator<Recipe>, Serializable {
        public Recipe createInstance(Type type) {
            return new Recipe();
        }
    }
}
