package task;

import ingredient.GrilledIngredient;
import ingredient.Ingredient;

public class Grill extends Task {
	
	public Grill(Ingredient ingr) {
		super(ingr);
	}
	
	@Override
	public String describe() {
		return "Grelhar " + ingrs[0].getName();
	}

	@Override
	public Ingredient result() {
		return new GrilledIngredient(ingrs[0]);
	}

}
