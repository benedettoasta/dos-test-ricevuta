package main.com.dos.ricevuta;

import main.com.dos.ricevuta.products.AbstractProduct;
import main.com.dos.ricevuta.products.Book;

public class ProductFactory {

	public static AbstractProduct create(String input) {
		// TODO Auto-generated method stub
		AbstractProduct product = null;
		if(ProductParser.isValidInput(input)){
			String type = input.substring(0,input.indexOf("\"")).trim().toLowerCase();
			if("libro".equals(type))
			{
				product = new Book();
			}
			
		}
		
		return product;
	}

}
