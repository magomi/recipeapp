package org.codefromhell.recipesapp.model;

import java.io.Serializable;

public class Step implements Serializable {
    private static final long serialVersionUID = 4L;
    
    private String description;

    public Step() {
    }

    public Step(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Step{" +
                "description='" + description + '\'' +
                '}';
    }
}
