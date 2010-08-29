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
import org.apache.wicket.model.CompoundPropertyModel;
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

/**
 * @author Richard Wilkinson - richard.wilkinson@jweekend.com
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

        add(form);
    }
}
