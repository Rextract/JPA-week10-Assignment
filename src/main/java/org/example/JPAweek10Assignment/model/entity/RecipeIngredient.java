package org.example.JPAweek10Assignment.model.entity;

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
@Table(name = "recipe_ingredient")
@Slf4j
public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false)
    private String recipeIngredientId;

    @OneToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "ingredient")
    private Ingredient ingredient;

    private double amount;
    private Measurement measurement;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY
    )
    @JoinTable(name = "recipe")
    private Recipe recipe;

}
