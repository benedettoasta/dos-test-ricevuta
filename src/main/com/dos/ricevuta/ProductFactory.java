package main.com.dos.ricevuta;

import java.util.Arrays;

import main.com.dos.ricevuta.products.AbstractProduct;
import main.com.dos.ricevuta.products.Book;

public class ProductFactory {
	
	protected static final String[] BOOKS = {
			"book",
			"libro",
			"fumetto",
			"enciclopedia",
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
			
		}
		
		return product;
	}

}
