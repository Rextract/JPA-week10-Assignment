package org.example.JPAweek10Assignment.model.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"instructions"})
@EqualsAndHashCode(exclude = {"instructionId"})
@Entity
public class RecipeInstruction {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String instructionId;
    @Column(unique = true)
    private String instructions;



}
