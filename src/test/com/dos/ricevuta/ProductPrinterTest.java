package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.printers.ProductPrinter;

class ProductPrinterTest {

	@Test
	void givenProductPrinter_whenInputBook_thenStringForBillReturn() {
		String descrizione = "Il Signore degli anelli";
		float priceBook = 10;
		boolean imported = true;
		Book book = new Book(descrizione,priceBook,imported);
		
		String result = "Il Signore degli anelli - BOOK: 10.50";
		
		ProductPrinter productPrinter = new ProductPrinter(book);
		assertThat(productPrinter.print(), Is.is(result));
	}
	
	@Test
	void givenProductPrinter_whenInputFood_thenStringForBillReturn() {
		Food food = new Food("Cioccolata, calda",5,false);
		String result = "Cioccolata, calda - FOOD: 5.00";
		
		ProductPrinter productPrinter = new ProductPrinter(food);
		assertThat(productPrinter.print(), Is.is(result));
	}
	
	@Test
	void givenProductPrinter_whenSetFood_thenStringForBillReturn() {
		ProductPrinter productPrinter = new ProductPrinter(new Book());
		
		Food food = new Food("Cioccolata, calda",5,false);
		String result = "Cioccolata, calda - FOOD: 5.00";
		productPrinter.setProduct(food);
		assertThat(productPrinter.print(), Is.is(result));
	}
}
