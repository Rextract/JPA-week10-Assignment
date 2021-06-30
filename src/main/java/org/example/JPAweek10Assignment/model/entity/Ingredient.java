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
    private int ingredientId;
    private String ingredientName;




}
