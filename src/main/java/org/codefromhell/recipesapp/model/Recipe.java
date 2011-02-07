package org.codefromhell.recipesapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Recipe implements Serializable {
    private static final long serialVersionUID = 2L;

    private String title;

    private List<Ingredient> ingredients;

    private List<Step> preparation;

    public Recipe(String title, List<Ingredient> ingredients, List<Step> preparation) {
        this.title = title;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public Recipe() {
        ingredients = new ArrayList<Ingredient>();
        preparation = new ArrayList<Step>();    
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Step> getPreparation() {
        return preparation;
    }

    public void setPreparation(List<Step> preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", ingredients=" + ingredients +
                ", preparation=" + preparation +
                '}';
    }
}
