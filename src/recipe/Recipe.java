package recipe;

import task.Task;
import ingredient.Ingredient;

public class Recipe {
	
	protected String name;
	protected Ingredient[] ingrList;
	protected Task[] taskList;
	
	public Recipe(String name, Ingredient[] ingrList, Task[] taskList) {
		this.name = name;
		this.ingrList = ingrList;
		this.taskList = taskList;
	}
	
	public String describe() {
		return null;
	}
}
