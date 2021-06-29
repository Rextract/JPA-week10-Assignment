package org.example.JPAweek10Assignment.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class RecipeCategory {

    @Id

    private int categoryId;
    private String category;
    private List<Recipe> recipes;

}
