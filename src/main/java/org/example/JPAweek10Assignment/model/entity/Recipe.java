package org.example.JPAweek10Assignment.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Recipe {


    @Id
    private int recipeId;
    private String recipeName;

    @OneToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_ingredient_id")
    private List<RecipeIngredient> recipeIngredients;

    @ManyToOne(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "recipe_instruction_id")
    private RecipeInstruction instruction;

    @ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "recipe_category_id")
    private List<RecipeCategory> categories;


    public void addCategory(RecipeCategory category) {
        categories.add(category);
        category.getRecipes().add(this);
    }

    public void removeCategory (RecipeCategory category) {
        category.getRecipes().remove(this);
        categories.remove(category);
    }

}