package org.codefromhell.recipesapp;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RefreshingView;
import org.apache.wicket.markup.repeater.util.ModelIteratorAdapter;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.codefromhell.cookml.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The applications start page.
 *
 * @author Marco Grunert (magomi@gmail.com)
 *
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

    private String recipeTitle;

    private List<SimpleIngredient> ingredients;
    private List<String> ingredientUnits;
    private WebMarkupContainer ingredientsWmc;

    private List<SimpleStep> steps;
    private WebMarkupContainer stepsWmc;

    private String recipeAsXml;
    private Label recipeAsXmlLabel;

    /**
     * Constructor.
     *
     * @param parameters Additional url parameters that has been provided to the page.
     */
    public HomePage(final PageParameters parameters) {

        // add the style definions
        this.add(CSSPackageResource.getHeaderContribution(new ResourceReference(HomePage.class, "960.css")));
        this.add(CSSPackageResource.getHeaderContribution(new ResourceReference(HomePage.class, "recipeapp.css")));


        Form form = new Form("recipeForm", new CompoundPropertyModel<HomePage>(this));

        // title of the recipe
        form.add(new TextField("recipeTitle"));

        // create a list of possible units for ingredients
        ingredientUnits = new ArrayList<String>();
        ingredientUnits.add("Gramm");
        ingredientUnits.add("Kilogramm");
        ingredientUnits.add("Milliliter");
        ingredientUnits.add("Liter");
        ingredientUnits.add("Stück");
        ingredientUnits.add("Teelöffel");
        ingredientUnits.add("Esslöffel");

        // initialize the list of ingredients
        ingredients = new ArrayList<SimpleIngredient>();
        ingredients.add(new SimpleIngredient());

        // insert the list of all ingredients
        ingredientsWmc = new WebMarkupContainer("ingredientsWmc");
        RefreshingView<SimpleIngredient> ingredientsRv = new RefreshingView<SimpleIngredient>("ingredients") {
            @Override
            protected Iterator<IModel<SimpleIngredient>> getItemModels() {
                return new ModelIteratorAdapter<SimpleIngredient>(ingredients.iterator()) {
                    @Override
                    protected IModel<SimpleIngredient> model(SimpleIngredient object) {
                        return new CompoundPropertyModel<SimpleIngredient>(object);
                    }
                };
            }

            @Override
            protected void populateItem(final Item<SimpleIngredient> ingredientItem) {
                ingredientItem.add(new TextField("qty"));
                DropDownChoice<String> unitDDC = new DropDownChoice("unit", ingredientUnits);
                ingredientItem.add(unitDDC);
                ingredientItem.add(new TextField("item"));

                // create links to add a new ingredient or to remove an existing one
                ingredientItem.add(new AjaxButton("addIngredient") {
                    @Override
                    protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                        ingredients.add(new SimpleIngredient());
                        target.addComponent(ingredientsWmc);
                    }
                });
                ingredientItem.add(new AjaxButton("removeIngredient") {
                    @Override
                    protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                        ingredients.remove(ingredientItem.getModelObject());
                        target.addComponent(ingredientsWmc);
                    }
                });
            }
        };
        ingredientsWmc.add(ingredientsRv);
        ingredientsWmc.setOutputMarkupId(true);
        form.add(ingredientsWmc);

        // initialize the steps for this recipe
        steps = new ArrayList<SimpleStep>();
        steps.add(new SimpleStep());

        // insert the list of alle steps necessary for processing this recipe
        stepsWmc = new WebMarkupContainer("stepsWmc");
        RefreshingView<SimpleStep> stepsRv = new RefreshingView<SimpleStep>("steps") {
            @Override
            protected Iterator<IModel<SimpleStep>> getItemModels() {
                return new ModelIteratorAdapter<SimpleStep>(steps.iterator()) {
                    @Override
                    protected IModel<SimpleStep> model(SimpleStep object) {
                        return new CompoundPropertyModel<SimpleStep>(object);
                    }
                };
            }

            @Override
            protected void populateItem(final Item<SimpleStep> stepItem) {
                stepItem.add(new TextArea("step"));

                // create links to add a new step or to remove an existing one
                stepItem.add(new AjaxButton("addStep") {
                    @Override
                    protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                        steps.add(new SimpleStep());
                        target.addComponent(stepsWmc);
                    }
                });
                stepItem.add(new AjaxButton("removeStep") {
                    @Override
                    protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                        steps.remove(stepItem.getModelObject());
                        target.addComponent(stepsWmc);
                    }
                });
            }
        };
        stepsWmc.add(stepsRv);
        stepsWmc.setOutputMarkupId(true);
        form.add(stepsWmc);

        // create a submit button that converts the recipes ingredients and steps to xml
        form.add(new AjaxButton("createXml") {
            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                CookmlDocument cmlDoc = CookmlDocument.Factory.newInstance();

                RecipeDocument.Recipe recipe = cmlDoc.addNewCookml().addNewRecipe();

                HeadDocument.Head head = recipe.addNewHead();
                head.setTitle(recipeTitle);

                RecipeDocument.Recipe.Part part = recipe.addNewPart();
                for (SimpleIngredient simpleIngredient : ingredients) {
                    IngredientDocument.Ingredient ingredient = part.addNewIngredient();
                    ingredient.setQty(simpleIngredient.getQty());
                    ingredient.setUnit(simpleIngredient.getUnit());
                    ingredient.setItem(simpleIngredient.getItem());
                }

                PreparationDocument.Preparation preparation = recipe.addNewPreparation();
                for (SimpleStep simpleStep : steps) {
                    preparation.addStep(simpleStep.getStep());
                }

                recipeAsXml = cmlDoc.toString();

                target.addComponent(recipeAsXmlLabel);
            }
        });

        form.add(new AjaxButton("reset") {
            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                setResponsePage(HomePage.class);
            }
        });

        // add a display areay for the generated xml
        recipeAsXmlLabel = new Label("recipeAsXml");
        recipeAsXmlLabel.setOutputMarkupId(true);
        form.add(recipeAsXmlLabel);

        add(form);
    }

}
