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

    List<Recipe> findAllByRecipeId(String recipe);
    @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeName) = UPPER(:recipe)")
    List<Recipe> findAllByRecipeIdJPQL(
            @Param("recipe") String recipe);

   Optional<Recipe> findByRecipeNameIsContainingAndRecipeIngredients(Ingredient ingredientName, RecipeIngredient recipeIngredient);
   @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeIngredients) = UPPER(:recipe)")
   Optional<Recipe> findByRecipeNameIsContainingAndRecipeIngredientsJPQL(
           @Param("recipe") String recipe);


   List<Recipe> findAllByRecipeIdAndCategories(RecipeCategory category);


}
