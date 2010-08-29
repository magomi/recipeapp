package org.codefromhell.recipesapp;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RefreshingView;
import org.apache.wicket.markup.repeater.util.ModelIteratorAdapter;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.codefromhell.cookml.CookmlDocument;
import org.codefromhell.cookml.IngredientDocument;
import org.codefromhell.cookml.PreparationDocument;
import org.codefromhell.cookml.RecipeDocument;
import org.odlabs.wiquery.core.events.Event;
import org.odlabs.wiquery.core.events.MouseEvent;
import org.odlabs.wiquery.core.events.WiQueryAjaxEventBehavior;
import org.odlabs.wiquery.core.events.WiQueryEventBehavior;
import org.odlabs.wiquery.core.javascript.JsScope;
import org.odlabs.wiquery.ui.tabs.Tabs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The applications start page.
 *
 * @author Marco Grunert (magomi@gmail.com)
 *
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;
	
	private String rBezeichnung;
    private String z1Menge;
    private String z1Einheit;
    private String z1Bezeichnung;
    private String z2Menge;
    private String z2Einheit;
    private String z2Bezeichnung;
    private String s1;
    private String s2;
    private String s3;

    private ArrayList<String> recipes;

    /**
     * Constructor.
     *
     * @param parameters Additional url parameters that has been provided to the page.
     */
    public HomePage(final PageParameters parameters) {

        Form form = new Form("recipeForm", new CompoundPropertyModel<HomePage>(this));

        form.add(new TextField("rBezeichnung"));
        form.add(new TextField("z1Menge"));
        form.add(new TextField("z1Einheit"));
        form.add(new TextField("z1Bezeichnung"));
        form.add(new TextField("z2Menge"));
        form.add(new TextField("z2Einheit"));
        form.add(new TextField("z2Bezeichnung"));
        form.add(new TextArea("s1"));
        form.add(new TextArea("s2"));
        form.add(new TextArea("s3"));

        form.add(new AjaxButton("submit") {
            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                CookmlDocument cmlDoc = CookmlDocument.Factory.newInstance();

//                RecipeDocument.Recipe recipe = RecipeDocument.Factory.newInstance().getRecipe();
                RecipeDocument.Recipe recipe = cmlDoc.addNewCookml().addNewRecipe();

                RecipeDocument.Recipe.Part part = recipe.addNewPart();
                IngredientDocument.Ingredient ing01 = part.addNewIngredient();
                ing01.setQty(Float.parseFloat(z1Menge));
                ing01.setUnit(z1Einheit);
                ing01.setItem(z1Bezeichnung);

                IngredientDocument.Ingredient ing02 = part.addNewIngredient();
                ing02.setQty(Float.parseFloat(z1Menge));
                ing02.setUnit(z1Einheit);
                ing02.setItem(z1Bezeichnung);

                PreparationDocument.Preparation prep01 = recipe.addNewPreparation();
                prep01.addStep(s1);
                prep01.addStep(s2);
                prep01.addStep(s3);

                try {
                    cmlDoc.save(new File("/tmp/recipe.xml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        recipes = new ArrayList<String>();
        recipes.add("Hefeklöße");
        recipes.add("Gekochte Eier");

        RefreshingView<String> recipesRV = new RefreshingView<String>("recipesList") {
            @Override
            protected Iterator<IModel<String>> getItemModels() {
                return new ModelIteratorAdapter<String>(recipes.iterator()) {
                    @Override
                    protected IModel<String> model(String object) {
                        return new CompoundPropertyModel<String>(object);
                    }
                };
            }

            @Override
            protected void populateItem(Item<String> stringItem) {
                stringItem.add(new Label("recipe", Model.of(stringItem.getModelObject())));
            }
        };
        
        form.add(recipesRV);

        add(form);
    }
}
