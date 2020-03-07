package test.com.dos.ricevuta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.ProductFactory;
import main.com.dos.ricevuta.products.AbstractProduct;
import main.com.dos.ricevuta.products.Book;

class ProductFactoryTest {

	@Test
	void givenInputString_whenInputIsNotValid_thenNullReturn() {
		String input = "testo non corretto per input";
		AbstractProduct product = ProductFactory.create(input);
		assertNull(product);
	}
	
	@Test
	void givenInputString_whenInputIsBook_thenInstanceOfBookReturn() {
		String input = "Libro \"Il signore degli anelli\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Book);
	}

}
