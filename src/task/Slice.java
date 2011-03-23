package task;

import ingredient.Ingredient;
import ingredient.SlicedIngredient;

public class Slice extends Task {
	
	public Slice(int numberOfIngredientsToGet) {
		super(numberOfIngredientsToGet);
	}
	
	public Slice(Ingredient ingr) {
		super(ingr);
	}
	
	@Override
	public String describe() {
		return "Fatiar " + ingrs[0].getName();
	}

	@Override
	public Ingredient result() {
		return new SlicedIngredient(ingrs[0]);
	}

}
