package main.com.dos.ricevuta;

import java.util.Arrays;

import main.com.dos.ricevuta.products.AbstractProduct;
import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;

public class ProductFactory {
	
	protected static final String[] BOOKS = {
			"book",
			"libro",
			"fumetto",
			"enciclopedia",
	};
	
	protected static final String[] FOODS = {
			"snack",
			"pasta",
			"pane",
			"dolce",
	};

	public static AbstractProduct create(String input) {
		// TODO Auto-generated method stub
		AbstractProduct product = null;
		if(ProductParser.isValidInput(input)){
			
			String type = ProductParser.getTypeFromValidInput(input);
			String description = ProductParser.getDescriptionFromValidInput(input);
			float price = ProductParser.getPriceFromValidInput(input);
			
			if(Arrays.asList(BOOKS).contains(type))
			{
				product = new Book(description,price);
			}
			else if(Arrays.asList(FOODS).contains(type))
			{
				product = new Food(description,price);
			}
			
		}
		
		return product;
	}

}
