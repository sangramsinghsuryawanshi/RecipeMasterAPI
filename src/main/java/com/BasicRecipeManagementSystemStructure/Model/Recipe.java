package com.BasicRecipeManagementSystemStructure.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recipe 
{
	@Id
	private int recipeId;
	private String recipeName;
	private String recipeInstruction;
	private String recipeTime;
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeInstruction() {
		return recipeInstruction;
	}
	public void setRecipeInstruction(String recipeInstruction) {
		this.recipeInstruction = recipeInstruction;
	}
	public String getRecipeTime() {
		return recipeTime;
	}
	public void setRecipeTime(String recipeTime) {
		this.recipeTime = recipeTime;
	}
	public Recipe(int recipeId, String recipeName, String recipeInstruction, String recipeTime) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipeInstruction = recipeInstruction;
		this.recipeTime = recipeTime;
	}
	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", recipeInstruction="
				+ recipeInstruction + ", recipeTime=" + recipeTime + "]";
	}
	
}
