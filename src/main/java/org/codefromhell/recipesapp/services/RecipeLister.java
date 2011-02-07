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

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

@Deprecated
public class RecipeLister {
    private String baseUrl;

    public RecipeLister(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public HashMap<String, String> getJsonRecipeList() {
        HashMap<String, String> recipes = new HashMap<String, String>();

        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet get = new HttpGet(baseUrl);
            HttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            String rlJson = EntityUtils.toString(entity);

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(IntermediateRecipeList.class, new IntermediateRecipeListCreator());
            Gson gson =  gsonBuilder.create();
            IntermediateRecipeList rlObject = gson.fromJson(rlJson, IntermediateRecipeList.class);

            for (String key : rlObject.getBlobs().keySet()) {
                if (key.endsWith(".json") && key.startsWith("recipes/")) {
                    recipes.put(key, rlObject.getBlobs().get(key));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipes;
    }

    public static void main(String[] args) {
        RecipeLister rl = new RecipeLister("http://github.com/api/v2/json/blob/all/magomi/recipebase/master");
        System.out.println(rl.getJsonRecipeList());
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

    private class IntermediateRecipeListCreator implements InstanceCreator<IntermediateRecipeList> {
        public IntermediateRecipeList createInstance(Type type) {
            return new IntermediateRecipeList();
        }
    }
}
