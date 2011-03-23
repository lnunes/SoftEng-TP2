package task;

import ingredient.Ingredient;

public abstract class Task {
	
	protected Ingredient[] ingrs;
	protected int numberOfIngredientsToGet;
	
	public Task(int numberOfIngredientsToGet) {
		this.numberOfIngredientsToGet = numberOfIngredientsToGet;
	}
	
	public Task(Ingredient[] ingrs) {
		setIngredients(ingrs);
		this.numberOfIngredientsToGet = 0;
	}
	
	public Task(Ingredient ingrName) {
		this(new Ingredient[] {ingrName});
	}
	
	public int getLastIngredients() {
		return numberOfIngredientsToGet;
	}
	
	public Ingredient[] getIngredients() {
		return ingrs;
	}
	
	public void setIngredients(Ingredient[] ingrs) {
		this.ingrs = ingrs;
	}
	
	public abstract String describe();
	public abstract Ingredient result();
}
