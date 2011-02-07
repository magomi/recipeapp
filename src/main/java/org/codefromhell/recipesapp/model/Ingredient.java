package org.codefromhell.recipesapp.model;

import java.io.Serializable;

public class Ingredient implements Serializable {
    private static final long serialVersionUID = 1L;

    private Double quantity;
    private String unit;
    private String description;

    public Ingredient() {
    }

    public Ingredient(Double quantity, String unit, String description) {
        this.quantity = quantity;
        this.unit = unit;
        this.description = description;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
