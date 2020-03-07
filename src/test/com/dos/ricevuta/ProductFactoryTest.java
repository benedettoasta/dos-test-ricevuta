package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.ProductFactory;
import main.com.dos.ricevuta.products.AbstractProduct;
import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.products.GenericProduct;
import main.com.dos.ricevuta.products.Music;
import main.com.dos.ricevuta.products.Pharm;

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
	
	@Test
	void givenInputString_whenInputIsBook_thenBookDataTypeCorrectlyReturn() {
		String input = "Libro \"Il signore degli anelli\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertThat(product.getType(), Is.is("BOOK"));
	}
	
	@Test
	void givenInputString_whenInputIsBook_thenBookDataDescriptionCorrectlyReturn() {
		String input = "Libro \"Il signore, degli anelli\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertThat(product.getDescription(), Is.is("Il signore, degli anelli"));
	}
	
	@Test
	void givenInputString_whenInputIsBook_thenBookDataPriceCorrectlyReturn() {
		String input = "Libro \"Il signore, degli anelli\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertThat(product.getPrice(), Is.is(12.49F));
	}
	

	@Test
	void givenInputString_whenInputIsFumetto_thenBookDataTypeCorrectlyReturn() {
		String input = "Fumetto \"Topolino\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertThat(product.getType(), Is.is("BOOK"));
	}
	

	@Test
	void givenInputString_whenInputIsSnack_thenInstanceOfBookReturn() {
		String input = "snack \"popcorn\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Food);
	}

	@Test
	void givenInputString_whenInputIsPasta_thenFoodDataTypeCorrectlyReturn() {
		String input = "Pasta \"spaghetti #5\", prezzo 12.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Food);
	}
	
	@Test
	void givenInputString_whenInputIsCompactDisc_thenInstanceOfMusicReturn() {
		String input = "CompactDisk \"innuendo\", prezzo 0.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Music);
	}
	
	@Test
	void givenInputString_whenInputIsHeadset_thenInstanceOfMusicReturn() {
		String input = "headset \"cuffie da 3.5mm\", prezzo 0.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Music);
	}
	
	@Test
	void givenInputString_whenInputIsAntibiotico_thenInstanceOfPharmReturn() {
		String input = "Antibiotico \"tachipirina\", prezzo 10.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Pharm);
	}
	
	@Test
	void givenInputString_whenInputIsVitamina_thenInstanceOfPharmReturn() {
		String input = "Vitamina \"flaconcini 20\", prezzo 0.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Pharm);
	}
	
	@Test
	void givenInputString_whenInputIsOtherType_thenInstanceOfGenericProductReturn() {
		String input = "Qualsiasi Prodotto \"pentole da cucina\", prezzo 53.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof GenericProduct);
	}
	
	@Test
	void givenInputString_whenInputSnackIsImported_thenInstaceOfFoodReturn() {
		/**
		 * non è definito nel testo dell'esercizio, ma assumo che sul tipo sia presente un prefisso "Imported "
		 */
		String input = "Imported snack \"Cioccolato\", prezzo 3.49";
		AbstractProduct product = ProductFactory.create(input);
		assertTrue(product instanceof Food);
	}

}
