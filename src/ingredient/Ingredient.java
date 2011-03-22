package ingredient;

public class Ingredient {
	
	protected float quantity;
	protected String name;
	
	public Ingredient(String name, Float quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String describe() {
		return quantity + " " + name;
	}
}
