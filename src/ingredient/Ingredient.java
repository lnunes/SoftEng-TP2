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
		return quantity + " " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ingredient)) {
			return false;
		}
		
		Ingredient o = (Ingredient) obj;
		return name.equals(o.getName());
	}
}
