package org.example.JPAweek10Assignment.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"categoryId", "recipes", "category"})
@EqualsAndHashCode(exclude = {"categoryId", "category"})
@Entity
public class RecipeCategory {

    @Id
    private int categoryId;
    private String category;

    @OneToMany(
            mappedBy = "recipes_id",
            cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE},
            fetch = FetchType.LAZY)
    private List<Recipe> recipes;


    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        recipe.getCategories().add(this);
    }

    public void removeRecipe(Recipe recipe) {
        recipe.getCategories().remove(this);
        recipes.remove(recipe);
    }

}
