package recipe;

import ingredient.Ingredient;

import java.util.ArrayList;

import task.Task;

public class Recipe {
	
	protected String name;
	protected ArrayList<Ingredient> ingrList = new ArrayList<Ingredient>();
	protected Task[] taskList;
	
	public Recipe(String name, Ingredient[] ingrList, Task[] taskList) {
		this.name = name;
		for (Ingredient ingr : ingrList) {
			this.ingrList.add(ingr);
		}
		this.taskList = taskList;
	}
	
	public String describe() throws RecipeException{
		String ret = name + ":\r\n";
		
		if (!ingrList.isEmpty()) {
			ret += "Ingredientes:\r\n";
			for (Ingredient ingredient : ingrList) {
				ret += "\t" + ingredient.describe() + "\r\n";
			}
		}
		
		ret += "\r\n";
		
		if (taskList.length > 0) {
			ret += "Modo de preparo:\r\n";
			for (Task task : taskList) {
				Ingredient[] neededIngr = task.getIngredients();
				for (Ingredient ingredient : neededIngr) {
					if (!ingrList.contains(ingredient)) {
						throw new RecipeException("Faltou ingrediente " + ingredient.getName() + " na receita " + name);
					}
					
					ingrList.remove(ingredient);
				}
				
				ret += "\t" + task.describe() + "\r\n";
				ingrList.add(task.result());
			}
			
		}
		
		ret += "\r\n";
		
		ret += "Resultado:\r\n\t" + ingrList.get(0).getName();
		
		return ret;
	}
	
	@SuppressWarnings("serial")
	public static class RecipeException extends Exception {
		public RecipeException(String message) {
			super(message);
		}
	}
}
