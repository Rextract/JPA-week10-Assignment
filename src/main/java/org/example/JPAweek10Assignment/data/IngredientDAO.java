package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface IngredientDAO extends JpaRepository<Ingredient, String> {

    List<Ingredient> findByNameIgnoreCase(String ingredientName);
    @Query
            ("SELECT a FROM Ingredient a WHERE UPPER(a.ingredientName) = UPPER(:ingredientName)")
    List<Ingredient> findByNameIgnoreCaseJPQL(
            @Param
                    ("ingredientName") Integer ingredientName);


    List<Ingredient> findAllByIngredientName (String ingredientName);
    @Query
            ("SELECT a FROM Ingredient a WHERE UPPER(a.ingredientName) = UPPER(:ingredientName)")
    List<Ingredient> findAllByIngredientNameJPQL(
    @Param
            ("ingredientName") Integer ingredientName);

    }

