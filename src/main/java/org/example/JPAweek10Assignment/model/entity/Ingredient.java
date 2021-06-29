package org.example.JPAweek10Assignment.model.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "ingredient",
               fetch = FetchType.LAZY)
    private int ingredientId;
    private String ingredientName;


    public void ingredients (Ingredient ingredient) {
        ingredientName.add(ingredient);
        ingredient.setIngredientId(this);
    }

    public void ingredientsBack ( Ingredient ingredient) {
        ingredient.setIngredientName(null);
        ingredientName.remove(ingredient);
    }

}
