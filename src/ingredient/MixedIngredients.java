package ingredient;

public class MixedIngredients extends Ingredient {
	
	protected Ingredient[] ingrList;
	
	public MixedIngredients(Ingredient[] ingrList) {
		super("Mistura de ", 0f);
		this.ingrList = ingrList;
	}
	
	@Override
	public String describe() {
		String ret = name + "(";
		
		for (int i = 0; i < ingrList.length; i++) {
			Ingredient ingr = ingrList[i];
			ret += ingr.describe();
			if (i != (ingrList.length - 1)) {
				ret += " e ";
			}
		}
		
		ret += ")";
		
		return ret;
	}
}
