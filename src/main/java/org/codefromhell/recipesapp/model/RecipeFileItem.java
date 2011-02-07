package org.codefromhell.recipesapp.model;

import java.io.Serializable;

public class RecipeFileItem implements Serializable {
    private static final long serialVersionUID = 3L;
    
    private String hash;
    private String file;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public RecipeFileItem(String hash, String file) {
        this.hash = hash;
        this.file = file;
    }

    @Override
    public String toString() {
        return "RecipeFileItem{" +
                "hash='" + hash + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
