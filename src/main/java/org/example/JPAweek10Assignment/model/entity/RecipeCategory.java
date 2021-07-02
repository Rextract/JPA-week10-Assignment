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
    @Column(updatable = false)
    private String category;

    @ManyToMany(
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recipe_recipe_category",
            joinColumns = @JoinColumn(name = "recipe_category_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
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
