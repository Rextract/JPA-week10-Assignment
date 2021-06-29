package org.example.JPAweek10Assignment.model.entity;

import lombok.*;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class RecipeCategory {

    private int categoryId;
    private String category;
    private List<Recipe> recipes;

}
