package com.nestdigital.Recipe.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipe")
public class RecipeModel {
    @Id
    @GeneratedValue
    private int id;
    private String recipeName;
    private String recipeItem;
    private String recipeMake;
    private String recipeQuality;

    public RecipeModel(int id, String recipeName, String recipeItem, String recipeMake, String recipeQuality) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeItem = recipeItem;
        this.recipeMake = recipeMake;
        this.recipeQuality = recipeQuality;
    }

    public RecipeModel() {
    }

    public int getId() {
        return id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeItem() {
        return recipeItem;
    }

    public String getRecipeMake() {
        return recipeMake;
    }

    public String getRecipeQuality() {
        return recipeQuality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeItem(String recipeItem) {
        this.recipeItem = recipeItem;
    }

    public void setRecipeMake(String recipeMake) {
        this.recipeMake = recipeMake;
    }

    public void setRecipeQuality(String recipeQuality) {
        this.recipeQuality = recipeQuality;
    }
}