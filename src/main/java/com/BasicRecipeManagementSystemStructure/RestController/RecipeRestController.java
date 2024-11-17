package com.BasicRecipeManagementSystemStructure.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BasicRecipeManagementSystemStructure.Model.Recipe;
import com.BasicRecipeManagementSystemStructure.Services.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeRestController 
{
	private final RecipeService recipeService;

	public RecipeRestController(RecipeService recipeService) 
	{
		super();
		this.recipeService = recipeService;
	}
	
	@PostMapping
	public String createRecipe(@RequestBody Recipe recipe)
	{
		return recipeService.createRecipe(recipe);
	}
	@GetMapping
	public List<Recipe> getAllRecipe()
	{
		return recipeService.getAllRecipe();
	}
	@PutMapping
	public String updateRecipe(@RequestBody Recipe recipe)
	{
		return recipeService.updateRecipe(recipe);
	}
	@GetMapping("{recipeId}")
	public Recipe getRecipeById(@PathVariable int recipeId)
	{
		return recipeService.getRecipeById(recipeId);
	}
	@DeleteMapping("{recipeId}")
	public String deleteRecipeById(@PathVariable int recipeId)
	{
		return recipeService.deleteRecipeById(recipeId);
	}
}
