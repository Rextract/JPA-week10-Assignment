package org.example.JPAweek10Assignment.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"recipeCategoryId"})
@EqualsAndHashCode(exclude = {"recipeId", "recipeCategoryId"})
@Entity
public class RecipeRecipeCategory {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private int recipeId;
    private int recipeCategoryId;

}
