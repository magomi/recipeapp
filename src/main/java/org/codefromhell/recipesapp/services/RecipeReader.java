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

import java.io.IOException;
import java.lang.reflect.Type;

@Deprecated
public class RecipeReader {
    private String baseUrl;

    public RecipeReader(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Recipe getRecipe(String recipeId) {
        Recipe recipe = null;
        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpGet get = new HttpGet(baseUrl + "/" + recipeId);
            HttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            String recipeData = EntityUtils.toString(entity);
            
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Recipe.class, new RecipeCreator());
            Gson gson =  gsonBuilder.create();
            recipe = gson.fromJson(recipeData, Recipe.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipe;
    }

    public String recipeToJson(Recipe recipe) {
        Gson gson = new Gson();
        return gson.toJson(recipe);
    }

    public static void main(String[] args) {
        RecipeReader rr = new RecipeReader("http://github.com/api/v2/json/blob/show/magomi/recipebase/");

        System.out.println(rr.getRecipe("8cef682258c0b5d68762c926ae8c657f8a9568e5"));
        System.out.println(rr.getRecipe("8da47da0de3caa55a522b07f9473769e0a1b3056"));

//        List<Ingredient> ingredients = new ArrayList<Ingredient>();
//        ingredients.add(new Ingredient(1d, "kg", "Gemüse"));
//        ingredients.add(new Ingredient(0.5, "l", "Wasser"));
//        ingredients.add(new Ingredient(3d, "Esslöffel", "Gewürze"));
//
//        List<Step> preparation = new ArrayList<Step>();
//        preparation.add(new Step("Gemüse kleinschneiden"));
//        preparation.add(new Step("Gemüse im Wasser 20 kochen"));
//        preparation.add(new Step("Pürieren"));
//        preparation.add(new Step("nach Geschmack würzen"));
//
//        Recipe recipe = new Recipe("Gemüsesuppe", ingredients, preparation);
//
//        System.out.println(rr.recipeToJson(recipe));
    }

    private class RecipeCreator implements InstanceCreator<Recipe> {
        public Recipe createInstance(Type type) {
            return new Recipe();
        }
    }
}
