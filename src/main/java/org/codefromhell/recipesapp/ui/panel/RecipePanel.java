package org.codefromhell.recipesapp.ui.panel;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RefreshingView;
import org.apache.wicket.markup.repeater.util.ModelIteratorAdapter;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.codefromhell.recipesapp.model.Ingredient;
import org.codefromhell.recipesapp.model.Recipe;
import org.codefromhell.recipesapp.model.Step;

import java.util.Iterator;

public class RecipePanel extends Panel {
    private static final long serialVersionUID = 7L;
    
    public RecipePanel(String id, final IModel<Recipe> recipeModel) {
        super(id, recipeModel);

        add(new Label("title"));

        add(new Label("ingredientsLabel", Model.of("Ingredients")) {
            @Override
            public boolean isVisible() {
                return (recipeModel.getObject().getIngredients().size() > 0);
            }
        });

        RefreshingView<Ingredient> ingredientsRv = new RefreshingView<Ingredient>("ingredients") {
            @Override
            protected Iterator<IModel<Ingredient>> getItemModels() {
                return new ModelIteratorAdapter<Ingredient>(recipeModel.getObject().getIngredients().iterator()) {
                    @Override
                    protected IModel<Ingredient> model(Ingredient object) {
                        return new CompoundPropertyModel<Ingredient>(object);
                    }
                };
            }

            @Override
            protected void populateItem(Item<Ingredient> ingredientItem) {
                ingredientItem.add(new Label("quantity"));
                ingredientItem.add(new Label("unit"));
                ingredientItem.add(new Label("description"));
            }
        };
        add(ingredientsRv);

        add(new Label("preparationLabel", Model.of("Preparation")) {
            @Override
            public boolean isVisible() {
                return (recipeModel.getObject().getPreparation().size() > 0);
            }
        });

        RefreshingView<Step> preparationRv = new RefreshingView<Step>("preparation") {
            @Override
            protected Iterator<IModel<Step>> getItemModels() {
                return new ModelIteratorAdapter<Step>(recipeModel.getObject().getPreparation().iterator()) {
                    @Override
                    protected IModel<Step> model(Step object) {
                        return new CompoundPropertyModel<Step>(object);
                    }
                };
            }

            @Override
            protected void populateItem(Item<Step> stepItem) {
                stepItem.add(new Label("description"));
            }
        };
        add(preparationRv);
    }
}
