package org.example.JPAweek10Assignment.model.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"instruction"})
@EqualsAndHashCode(exclude = {"recipeId", "instruction"})
@Entity
@Slf4j
public class Recipe {


    @Id
    @Column(updatable = false)
    private int recipeId;
    private String recipeName;

    @OneToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE},
            fetch = FetchType.LAZY,
            mappedBy = "recipe",
            orphanRemoval = true
    )
    @JoinColumn(name = "recipe_ingredients_id")
    private List<RecipeIngredient> recipeIngredients;

    @ManyToOne(
            cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST},
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

    public List<RecipeIngredient> getRecipeIngredient(){
        if (recipeIngredients == null) recipeIngredients = new ArrayList<>();
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        if (recipeIngredients == null) recipeIngredients = new ArrayList<>();
        while (recipeIngredients.remove(null)) {
            log.warn("Removed null from list recipeIngredients");
        }

        if (recipeIngredients.isEmpty()) {
            if (this.recipeIngredients != null) {
                for (RecipeIngredient recipeIngredient : this.recipeIngredients){
                    recipeIngredient.setRecipe(null);
                }
            }
        }else {
            for (RecipeIngredient recipeIngredient : recipeIngredients){
                recipeIngredient.setRecipe(this);
            }
        }
        this.recipeIngredients = recipeIngredients;

    }

  /* public void addRecipeInstructions (RecipeInstruction instruction) {
        if (instruction == null) throw new IllegalArgumentException("RecipeInstruction instruction was null");
        if (recipeIngredients == null) recipeIngredients = new ArrayList<>();
        if (!recipeIngredients.contains(instruction)){
            recipeIngredients.add(instruction);
            instruction.setInstructions(this);
        }
    }
    */
}