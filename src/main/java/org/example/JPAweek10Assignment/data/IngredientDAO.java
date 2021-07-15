package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface IngredientDAO extends JpaRepository<Ingredient, Integer> {



    List<Ingredient> findByIngredientName(String ingredientName);

    List<Ingredient> findByIngredientNameStartingWith(String ingredientName);


}
