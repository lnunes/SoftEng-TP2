package task;

import ingredient.Ingredient;

public abstract class Task {
	
	protected String[] ingrNames;
	
	public Task(String[] ingrNames) {
		this.ingrNames = ingrNames;
	}
	
	public Task(String ingrName) {
		this(new String[] {ingrName});
	}
	
	public String[] getIngredientNames() {
		return ingrNames;
	}
	
	public abstract String describe(Ingredient[] ingrs);
	public abstract Ingredient result();
}
