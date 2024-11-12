package com.BasicRecipeManagementSystemStructure.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BasicRecipeManagementSystemStructure.Model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe, Integer>
{
	
}
