package recipe;

import ingredient.Ingredient;

@SuppressWarnings("serial")
public class RecipeException extends Exception {
	public RecipeException(Recipe recipe, Ingredient ingr) {
		super("Faltou ingrediente " + ingr.getName() + " na receita " + recipe.getName());
	}
}
