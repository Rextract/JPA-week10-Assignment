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

    @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeName) = UPPER(:recipe)")
    List<Recipe> findByRecipeNameIgnoreCase(String recipeName);
    List<Recipe> findAllByRecipeIdIgnoreCase(
            @Param("recipe") int recipe);


    @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeIngredients) = UPPER(:recipe)")
   Optional<Recipe> findAllRecipesContainingIngredientName(Ingredient ingredientName, RecipeIngredient recipeIngredient);
   Optional<RecipeIngredient> RecipeIngredient(
           @Param("recipe") String recipe);


    @Query("SELECT b FROM Recipe b WHERE UPPER(b.categories) = UPPER(:recipe)")
   List<Recipe> findRecipeByCategories (Recipe recipe, String recipeCategory);
   Optional<Recipe>  RecipeCategory(
           @Param("recipe") String recipe);



    @Query("SELECT b FROM Recipe b WHERE UPPER(b.categories) = UPPER(:recipe)")
   List<Recipe> findAllRecipeContainsRecipeCategories(Recipe recipe, RecipeCategory recipeCategory);
    Optional<Recipe> findAllRecipeContainsRecipeCategoriesIgnoreCase(
            @Param("recipe") String recipe);

}
