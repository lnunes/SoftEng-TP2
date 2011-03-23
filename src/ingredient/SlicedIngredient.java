package ingredient;

public class SlicedIngredient extends Ingredient {
	public SlicedIngredient(Ingredient ingr) {
		super(ingr.getName() + " Fatiado", ingr.getQuantity());
	}
}
