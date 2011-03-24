package ingredient;

public class MixedIngredients extends Ingredient {
	
	protected Ingredient[] ingrList;
	
	public MixedIngredients(Ingredient[] ingrList) {
		super("", 0f);
		this.ingrList = ingrList;
	}
	
	@Override
	public String getName() {
		String ret = "Mistura de (";
		
		for (int i = 0; i < ingrList.length; i++) {
			Ingredient ingr = ingrList[i];
			ret += ingr.getName();
			if (i != (ingrList.length - 1)) {
				ret += " e ";
			}
		}
		
		ret += ")";
		
		return ret;
	}
}
