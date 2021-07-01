package org.example.JPAweek10Assignment.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.example.JPAweek10Assignment.model.ENUM.Measurement;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"measurement", "amount"})
@EqualsAndHashCode(exclude = {"recipeIngredientId", "ingredient", "recipe"})
@Entity
public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String recipeIngredientId;

    @OneToOne(
            fetch = FetchType.LAZY, optional = false,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST}
    )
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;
    private double amount;
    private Measurement measurement;

    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

}
