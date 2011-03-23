package task;

import ingredient.ChoppedIngredient;
import ingredient.Ingredient;

public class Chop extends Task {
	
	public Chop(int numberOfIngredientsToGet) {
		super(numberOfIngredientsToGet);
	}
	
	public Chop(Ingredient ingr) {
		super(ingr);
	}
	
	@Override
	public String describe() {
		return "Picar " + ingrs[0].getName();
	}

	@Override
	public Ingredient result() {
		return new ChoppedIngredient(ingrs[0]);
	}

}
