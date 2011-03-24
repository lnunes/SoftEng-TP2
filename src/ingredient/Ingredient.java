package ingredient;

public class Ingredient {
	
	protected float quantity;
	protected String name;
	
	public Ingredient(String name, Float quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Ingredient(Ingredient ingr) {
		this(ingr.getName(), ingr.getQuantity());
	}
	
	public String getName() {
		return name;
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public String describe() {
		return getQuantity() + " " + getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ingredient) {
			return getName().equals(((Ingredient) obj).getName());
		}
		
		return false;
	}
}
