package org.codefromhell.recipesapp;

import java.io.Serializable;

/**
 * Ingredient for a recipe.
 */
class SimpleIngredient implements Serializable {
    /**
     * The description of this ingredient.
     */
    private String item;

    /**
     * The unit of the ingredient.
     */
    private String unit;

    /**
     * The quantity of the ingredient.
     */
    private int qty;

    /**
     * Constructor.
     */
    public SimpleIngredient() {
        this.unit = "Stück";
        this.qty = 0;
        this.item = "";
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}