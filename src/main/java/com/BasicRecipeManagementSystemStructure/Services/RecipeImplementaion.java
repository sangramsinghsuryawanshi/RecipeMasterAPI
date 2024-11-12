package com.BasicRecipeManagementSystemStructure.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BasicRecipeManagementSystemStructure.Model.Recipe;
import com.BasicRecipeManagementSystemStructure.Repository.RecipeRepo;

@Service
public class RecipeImplementaion implements RecipeService
{

	private final RecipeRepo recipeRepo;
	

	public RecipeImplementaion(RecipeRepo recipeRepo) {
		super();
		this.recipeRepo = recipeRepo;
	}

	@Override
	public String createRecipe(Recipe recipe) {
		if(recipeRepo!=null)
		{
			recipeRepo.save(recipe);
			return "Recipe created successfully...";
		}
		else
		{
			return "Recipe is not created..!";
		}
	}

	@Override
	public String updateRecipe(Recipe recipe) {
		if(recipeRepo!=null)
		{
			recipeRepo.save(recipe);
			return "Recipe updated successfully...";
		}
		else
		{
			return "Recipe not updated...";
		}
	}

	@Override
	public String deleteRecipeById(int recipeId) 
	{
		 Recipe r = recipeRepo.findById(recipeId).orElse(null);
		if(r.getRecipeId()==recipeId && r!=null)
		{
			recipeRepo.deleteById(recipeId);
			return "Recipe deleted successfully";
		}
		else
		{
			return "id not found";
		}
	}

	@Override
	public Recipe getRecipeById(int recipeId) 
	{
		return recipeRepo.findById(recipeId).get();
	}

	@Override
	public List<Recipe> getAllRecipe() {
		return recipeRepo.findAll();
	}
	
}
