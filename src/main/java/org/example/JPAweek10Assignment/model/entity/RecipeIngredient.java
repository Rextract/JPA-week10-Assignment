package org.example.JPAweek10Assignment.model.entity;

import lombok.*;
import org.example.JPAweek10Assignment.model.ENUM.Measurement;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String recipeIngredientId;

    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "")
    private Ingredient ingredient;
    private double amount;
    private Measurement measurement;
    private Recipe recipe;

}
