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
@Table(name = "ingredient")
public class Ingredient {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false)
    @JoinTable(name = "recipe_ingredient")
    private int ingredientId;

    @Column(unique = true)
    private String ingredientName;

}
