package entry;

import ingredient.ChoppedIngredient;
import ingredient.Ingredient;
import ingredient.PelledIngredient;
import recipe.Recipe;
import recipe.RecipeException;
import task.Chop;
import task.Grill;
import task.Mix;
import task.Pell;
import task.Slice;
import task.Task;

public class EntryClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print("========TP2 - Livro de Receitas========\n\n");
		
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
		
		print("");
		
		Ingredient abacaxi = new Ingredient("Abacaxi", 1f);
		Ingredient acucar = new Ingredient("Açúcar", 50f);
		Ingredient canela = new Ingredient("Canela", 50f);
		ingrList = new Ingredient[] {
				abacaxi,
				acucar,
				canela
		};
		
		Pell descascarAbacaxi = new Pell(abacaxi);
		
		mixIngr = new Ingredient[] {
				descascarAbacaxi.result(),
				acucar,
				canela
		};
		Mix mix = new Mix(mixIngr);
		
		Grill grelhar = new Grill(mix.result());
		
		taskList = new Task[] {
				descascarAbacaxi,
				mix,
				grelhar,
				new Slice(grelhar.result())
		};
		
		Recipe rcp2 = new Recipe("Abacaxi Grelhado", ingrList, taskList);
		try {
			print(rcp2.describe());
		} catch (RecipeException e) {
			print(e.getMessage());
			System.exit(0);
		}
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
