package org.example.JPAweek10Assignment.model.entity;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class RecipeInstruction {

    private String instructionId;
    private String instructions;



}
