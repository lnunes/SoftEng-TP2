package task;

import ingredient.Ingredient;
import ingredient.MixedIngredients;

public class Mix extends Task {
	
	public Mix(int numberOfIngredientsToGet) {
		super(numberOfIngredientsToGet);
	}
	
	public Mix(Ingredient[] ingrs) {
		super(ingrs);
	}
	
	@Override
	public String describe() {
		String ret = "Misturar ";
		
		for (int i = 0; i < ingrs.length; i++) {
			ret += ingrs[i].getName() + " "; 
			if (i != (ingrs.length - 1)) {
				ret += "e ";
			}
		}
		
		return ret;
	}

	@Override
	public Ingredient result() {
		return new MixedIngredients(ingrs);
	}

}
