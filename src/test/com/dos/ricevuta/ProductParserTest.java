/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.ProductParser;

/**
 * @author Benedetto
 *
 */
class ProductParserTest {

	@Test
	void givenInputString_whenInputContainsSpaceAndComma_thenProductParserIsValidReturnTrue() {
		String input = "Libro \"Il signore degli anelli\", prezzo 12.49";
		assertTrue(ProductParser.isValidInput(input));
	}
	
	@Test
	void givenInputString_whenInputContainsCommaInDescriptionAndNotAtTheEnd_thenProductParserIsValidReturnFalse() {
		String input = "Libro \"Il signore, degli anelli\" prezzo 12.49";
		assertFalse(ProductParser.isValidInput(input));
	}
}
