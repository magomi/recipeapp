package org.codefromhell.recipesapp;

import java.io.Serializable;

/**
 * A simple processing step for a recipe.
 */
class SimpleStep implements Serializable {

    /**
     * The description of this step.
     */
    String step;

    /**
     * The constructor.
     */
    public SimpleStep() {
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}