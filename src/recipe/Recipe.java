package recipe;

import java.util.LinkedList;
import java.util.Queue;

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
	
	protected Queue<Ingredient> resultQueue;
	
	public String describe() {
		String ret = name + ":\r\n";
		
		if (ingrList.length > 0) {
			ret += "Ingredientes:\r\n";
			for (Ingredient ingredient : ingrList) {
				ret += "\t" + ingredient.describe() + "\r\n";
			}
		}
		
		resultQueue = new LinkedList<Ingredient>();
		if (taskList.length > 0) {
			ret += "Modo de preparo:\r\n";
			for (Task task : taskList) {
				int numberOfLastIngr = task.getLastIngredients();
				Ingredient result = null;
				if (numberOfLastIngr == 0) { // Get the ingredients from the ingredients list
					result = task.result();
				} else { // Get a derived ingredient
					Ingredient[] ingrs = new Ingredient[numberOfLastIngr];
					for (int i = 0; i < ingrs.length; i++) {
						ingrs[i] = resultQueue.poll();
					}
					task.setIngredients(ingrs);
					result = task.result();
				}
				
				ret += "\t" + task.describe() + "\r\n";
				resultQueue.add(result);
			}
		}
		
		//At this point, resultQueue should be only one result, the final one
		
		ret += "Resultado:\r\n\t" + resultQueue.poll().describe();
		
		return ret;
	}
}
