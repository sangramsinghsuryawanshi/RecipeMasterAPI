package com.BasicRecipeManagementSystemStructure.Services;

import java.util.List;

import com.BasicRecipeManagementSystemStructure.Model.Recipe;

public interface RecipeService 
{
	public String createRecipe(Recipe recipe);
	public String updateRecipe(Recipe recipe);
	public String deleteRecipeById(int recipeId);
	public Recipe getRecipeById(int recipeId);
	public List<Recipe> getAllRecipe();
}
