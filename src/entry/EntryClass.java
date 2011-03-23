package entry;

import ingredient.Ingredient;
import recipe.Recipe;
import task.Chop;
import task.Mix;
import task.Pell;
import task.Slice;
import task.Task;

public class EntryClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print("========TP2 - Livro de Receitas========\n");
		
		Ingredient tomate = new Ingredient("Tomate", 2f);
		Ingredient cebola = new Ingredient("Cebola", 1f);
		Ingredient pimentao = new Ingredient("Pimentão", 0.5f);
		Ingredient vinagre = new Ingredient("Vinagre branco", 40f);
		Ingredient azeite = new Ingredient("Azeite", 20f);
		
		Ingredient[] ingrList = new Ingredient[] {
			tomate,
			cebola,
			pimentao,
			vinagre,
			azeite
		};
		
		Task[] taskList = new Task[] {
			new Slice(tomate),
			new Pell(cebola),
			new Chop(1),
			new Chop(pimentao),
			new Mix(3),
			new Mix(2),
			new Mix(2)
		};
		
		Recipe rcp1 = new Recipe("Molho à Campanha (Vinagrete)", ingrList, taskList);
		print(rcp1.describe());
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
