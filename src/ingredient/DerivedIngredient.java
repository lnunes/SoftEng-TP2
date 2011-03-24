package ingredient;

public class DerivedIngredient extends Ingredient {
	
	protected Ingredient ingr;
	protected String sufix;
	
	public DerivedIngredient(String sufix, Ingredient ingr) {
		super("", 0f);
		this.sufix = sufix; 
		this.ingr = ingr;
	}
	
	@Override
	public float getQuantity() {
		return ingr.getQuantity();
	}
	
	public String getName() {
		return ingr.getName() + " " + sufix;
	};
}
