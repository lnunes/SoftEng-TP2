package ingredient;

public class ChoppedIngredient extends Ingredient {
	public ChoppedIngredient(Ingredient ingr) {
		super(ingr.getName() + " Picado", ingr.getQuantity());
	}
}
