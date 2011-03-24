package task;

import ingredient.Ingredient;

public abstract class Task {
	
	protected Ingredient[] ingrs;
	
	public Task(Ingredient[] ingrs) {
		this.ingrs = ingrs;
	}
	
	public Task(Ingredient ingr) {
		this(new Ingredient[] {ingr});
	}
	
	public Ingredient[] getIngredients() {
		return ingrs;
	}
	
	public abstract String describe();
	public abstract Ingredient result();
}
