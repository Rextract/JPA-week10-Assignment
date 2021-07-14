package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface IngredientDAO extends JpaRepository<Ingredient, Integer> {


    @Query("SELECT a FROM Ingredient a WHERE UPPER(a.ingredientName) = UPPER(:ingredientName)")
    List<Ingredient> findIngredientByIngredientName(String ingredientName);
  //  Optional<Ingredient> findIngredientByIngredientNameJPQL (
  //          @Param("ingredientName") String ingredientName);


    @Query("SELECT a FROM Ingredient a WHERE UPPER(a.ingredientName) = UPPER(:ingredientName)")
    List<Ingredient> findIngredientByIngredientNameContaining(String ingredientName);
  //  Optional<Ingredient>findIngredientByIngredientNameContainingJPQL(
    //        @Param("ingredientName") String ingredientName);

}
