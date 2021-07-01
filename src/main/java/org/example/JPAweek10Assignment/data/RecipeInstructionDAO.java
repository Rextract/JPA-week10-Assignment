package org.example.JPAweek10Assignment.data;

import org.example.JPAweek10Assignment.model.entity.RecipeInstruction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeInstructionDAO extends JpaRepository<RecipeInstruction, String> {



}
