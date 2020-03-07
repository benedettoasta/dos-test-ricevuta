package test.com.dos.ricevuta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.ProductFactory;
import main.com.dos.ricevuta.products.AbstractProduct;

class ProductFactoryTest {

	@Test
	void givenInputString_whenInputIsNotValid_thenNullReturn() {
		String input = "testo non corretto per input";
		AbstractProduct product = ProductFactory.create(input);
		assertNull(product);
	}

}
