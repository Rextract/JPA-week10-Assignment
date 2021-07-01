package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Recipe;
import org.example.JPAweek10Assignment.model.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RecipeDAO extends JpaRepository<RecipeIngredient, String> {

    Optional<Recipe> findByRecipeRecipeName(String recipeName);
    @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeName) = UPPER(:recipeName)")
    List<Recipe> findByRecipeRecipeNameJPQL(
            @Param("recipeName") String recipeName);

    List<Recipe> findAllByRecipeAndIngredient(String recipeIngredient);
    @Query("SELECT b FROM RecipeIngredient b WHERE UPPER(b.ingredient) = UPPER(:recipeIngredient)")
    List<Recipe> findAllByRecipeAndIngredientJPQL(
            @Param("recipeIngredient") String recipeIngredient);

    List<Recipe> findAllByRecipeAndSpecificCategory(String recipeCategory);
    @Query("SELECT b FROM RecipeCategory b WHERE UPPER(b.category) = upper(:recipeCategory)")
    List<Recipe> findAllByRecipeAndCategoryJPQL(
            @Param("recipeCategory") String recipeCategory);

    

}
