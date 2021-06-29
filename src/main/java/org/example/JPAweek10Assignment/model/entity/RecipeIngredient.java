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
public class RecipeIngredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false)
    private String recipeIngredientId;

   @OneToMany(
           mappedBy = "recipeIngredient",
           cascade = {CascadeType.MERGE, CascadeType.REFRESH},
           orphanRemoval = true
   )
    private Ingredient ingredient;

    private double amount;
    private Measurement measurement;


    private Recipe recipe;

}
