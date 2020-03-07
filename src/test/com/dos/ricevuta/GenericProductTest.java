package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.GenericProduct;

class GenericProductTest {

	@Test
	void givenGenericProduct_whenGetType_thenGenericIsReturned() {
		GenericProduct genericProduct = new GenericProduct();
		assertThat(genericProduct.getType(), Is.is("GENERIC"));
	}

	@Test
	void givenGenericProductWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		String descrizione = "Monitor TV";
		float price = 100;
		float priceWithTax = 110;
		GenericProduct genericProduct = new GenericProduct(descrizione,price);
		assertThat(genericProduct.getPriceTaxed(), Is.is(priceWithTax));
	}
	
	@Test
	void givenImportedGenericProductWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		String descrizione = "Monitor TV";
		float price = 100;
		float priceWithTax = 115;
		GenericProduct genericProduct = new GenericProduct(descrizione,price,true);
		assertThat(genericProduct.getPriceTaxed(), Is.is(priceWithTax));
	}
	
}
