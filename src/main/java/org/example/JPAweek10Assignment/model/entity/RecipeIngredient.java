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
@ToString
@EqualsAndHashCode
@Entity
public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    private String recipeIngredientId;
    @ManyToOne(
            fetch = FetchType.LAZY, optional = false,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH}
    )
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;
    private double amount;
    private Measurement measurement;

    @ManyToOne
    private Recipe recipe;

}
