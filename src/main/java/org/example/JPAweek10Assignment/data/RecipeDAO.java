package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeDAO extends JpaRepository<Recipe, Integer> {

    List<Recipe> findAllByRecipeId(String recipe);
    @Query("SELECT b FROM Recipe b WHERE UPPER(b.recipeName) = UPPER(:Recipe) ")
    List<Recipe> findAllByRecipeIdJPQL(
            @Param("recipe") String recipe);

   

}
