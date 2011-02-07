package org.codefromhell.recipesapp.ui.panel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.OnChangeAjaxBehavior;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.codefromhell.recipesapp.model.RecipeFileItem;
import org.codefromhell.recipesapp.services.RecipeManager;

public abstract class RecipeListPanel extends Panel {
    private static final long serialVersionUID = 6L;
    
    private RecipeManager recipeManager;

    private RecipeFileItem selectedRecipeFileItem;

    public RecipeFileItem getSelectedRecipeFileItem() {
        return selectedRecipeFileItem;
    }

    public RecipeListPanel(String id) {
        super(id);

        recipeManager = new RecipeManager();

        Form recipesForm = new Form("recipesForm");
        add(recipesForm);

        DropDownChoice recipesDdc = new DropDownChoice(
                "recipes",
                new PropertyModel<String>(this, "selectedRecipeFileItem"),
                recipeManager.getRecipeIds("http://github.com/api/v2/json/blob/all", "magomi", "recipebase", "master"),
                new ChoiceRenderer<RecipeFileItem>("file", "hash") {
                    @Override
                    public Object getDisplayValue(RecipeFileItem object) {
                        return object.getFile();
                    }

                    @Override
                    public String getIdValue(RecipeFileItem object, int index) {
                        return object.getHash();
                    }
                });
        recipesDdc.add(new OnChangeAjaxBehavior() {
            @Override
            protected void onUpdate(AjaxRequestTarget target) {
                RecipeListPanel.this.onUpdate(target, selectedRecipeFileItem.getHash());
            }
        });
        recipesForm.add(recipesDdc);

    }

    public abstract void onUpdate(AjaxRequestTarget target, String recipeHash);
}
