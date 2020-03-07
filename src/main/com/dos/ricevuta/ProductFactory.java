package main.com.dos.ricevuta;

import main.com.dos.ricevuta.products.AbstractProduct;

public class ProductFactory {

	public static AbstractProduct create(String input) {
		// TODO Auto-generated method stub
		AbstractProduct product = null;
		if(ProductParser.isValidInput(input)){
			
		}
		
		return product;
	}

}
