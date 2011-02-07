package org.codefromhell.recipesapp;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.CompoundPropertyModel;
import org.codefromhell.recipesapp.model.Recipe;
import org.codefromhell.recipesapp.services.RecipeManager;
import org.codefromhell.recipesapp.ui.panel.RecipeListPanel;
import org.codefromhell.recipesapp.ui.panel.RecipePanel;

public class RecipesPage extends WebPage {
    private static final long serialVersionUID = 8L;
    
    private Recipe recipe = new Recipe();

    private RecipeManager recipeManager;

    private RecipePanel recipePanel;

    public RecipesPage() {
        recipeManager = new RecipeManager();

        setOutputMarkupId(true);

        add(new RecipeListPanel("recipeListPanel") {
            @Override
            public void onUpdate(AjaxRequestTarget target, String recipeHash) {
                recipe = recipeManager.getRecipe(
                        "http://github.com/api/v2/json/blob/show", "magomi",
                        "recipebase", recipeHash);

                // TODO
                // Very strange: why does a simple
                // target.addComponenten(recipePanel);
                // not work?
                RecipesPage.this.remove(recipePanel);
                recipePanel = new RecipePanel("recipePanel", new CompoundPropertyModel<Recipe>(recipe));
                RecipesPage.this.add(recipePanel);

                target.addComponent(RecipesPage.this);

            }
        });
        recipePanel = new RecipePanel("recipePanel", new CompoundPropertyModel<Recipe>(recipe));
        add(recipePanel);
    }
}
