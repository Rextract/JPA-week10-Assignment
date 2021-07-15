package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Ingredient;
import org.example.JPAweek10Assignment.model.entity.Recipe;
import org.example.JPAweek10Assignment.model.entity.RecipeCategory;
import org.example.JPAweek10Assignment.model.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RecipeDAO extends JpaRepository<Recipe, Integer> {


    List<Recipe> findByRecipeNameIsContaining(String recipeName);

    List<Recipe> findRecipeByRecipeIngredientsIngredientIngredientName(String ingredientName);

    List<Recipe> findRecipeByCategories(String category);

    List<Recipe> findRecipesByCategoriesContainingOrderByCategories(String category);


 //  List<Recipe> findRecipeByCategories (Recipe recipe, String recipeCategory);

//   List<Recipe> findAllRecipeContainsRecipeCategories(Recipe recipe, RecipeCategory recipeCategory);



}
