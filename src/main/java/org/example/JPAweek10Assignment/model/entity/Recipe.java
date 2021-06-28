package org.example.JPAweek10Assignment.model.entity;

import java.util.List;

public class Recipe {

    private int recipeId;
    private String recipeName;
    private List<RecipeIngredient> recipeIngredients;
    private RecipeInstruction instruction;
    private List<RecipeCategory> categories;

}
