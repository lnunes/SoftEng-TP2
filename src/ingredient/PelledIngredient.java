package ingredient;

public class PelledIngredient extends Ingredient {
	public PelledIngredient(Ingredient ingr) {
		super(ingr.getName() + " Descascado", ingr.getQuantity());
	}
}
