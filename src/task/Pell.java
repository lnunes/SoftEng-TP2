package task;

import ingredient.Ingredient;
import ingredient.PelledIngredient;

public class Pell extends Task {

	public Pell(int numberOfIngredientsToGet) {
		super(numberOfIngredientsToGet);
	}
	
	public Pell(Ingredient ingr) {
		super(ingr);
	}
	
	@Override
	public String describe() {
		return "Descascar " + ingrs[0].getName();
	}

	@Override
	public Ingredient result() {
		return new PelledIngredient(ingrs[0]);
	}

}
