package entry;

import ingredient.ChoppedIngredient;
import ingredient.Ingredient;
import ingredient.PelledIngredient;
import recipe.Recipe;
import recipe.Recipe.RecipeException;
import task.Chop;
import task.Mix;
import task.Pell;
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
		
		Ingredient[] mixIngr = new Ingredient[] {
				new ChoppedIngredient(new PelledIngredient(cebola)),
				new ChoppedIngredient(pimentao),
				new ChoppedIngredient(tomate)
		};
		Mix mix1 = new Mix(mixIngr);
		
		mixIngr = new Ingredient[] {
				vinagre,
				mix1.result()
		};
		Mix mix2 = new Mix(mixIngr);
		
		mixIngr = new Ingredient[] {
				azeite,
				mix2.result()
		};
		Mix mix3 = new Mix(mixIngr);
		
		Task[] taskList = new Task[] {
			new Chop(tomate),
			new Pell(cebola),
			new Chop(new PelledIngredient(cebola)),
			new Chop(pimentao),
			mix1,
			mix2,
			mix3
		};
		
		Recipe rcp1 = new Recipe("Molho à Campanha (Vinagrete)", ingrList, taskList);
		try {
			print(rcp1.describe());
		} catch (RecipeException e) {
			print(e.getMessage());
			System.exit(0);
		}
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
