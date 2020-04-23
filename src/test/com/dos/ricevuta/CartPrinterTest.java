package test.com.dos.ricevuta;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.products.Music;
import main.com.dos.ricevuta.Cart;
import main.com.dos.ricevuta.printers.CartPrinter;
import main.com.dos.ricevuta.printers.ProductPrinter;

class CartPrinterTest {
	
	@Test
	void givenCart_whenGetBillOnEmptyCart_thenEmptyBillReturn() {
		Cart cart = new Cart();
		CartPrinter cartPrinter = new CartPrinter(cart, new ProductPrinter());
		assertThat(cartPrinter.print(),Is.is("TAXES: 0.00 TOTAL: 0.00"));
	}

	@Test
	void givenCart_whenGetBillOnNotEmptyCart_thenBillWithTotalsReturn() {
		Cart cart = new Cart();
		cart.addProduct(new Book("Il signore degli anelli",12.49F,false));
		cart.addProduct(new Music("Innuendo",14.99F,false));
		cart.addProduct(new Food("Cioccolata",0.85F,false));
		
		String resultExpected = "Il signore degli anelli - BOOK: 12.49 Innuendo - MUSIC: 16.49 Cioccolata - FOOD: 0.85 TAXES: 1.50 TOTAL: 29.83";
		
		CartPrinter cartPrinter = new CartPrinter(cart, new ProductPrinter());
		assertThat(cartPrinter.print(),Is.is(resultExpected));
	}
	
	@Test
	void givenCart_whenBillCountsIsTenMultiple_thenBillContainsLuckyBonus() {
		Cart cart = new Cart();
		cart.setLuckyBonus(true);
		cart.addProduct(new Book("Il signore degli anelli",12.49F,false));
		cart.addProduct(new Music("Innuendo",14.99F,false));
		cart.addProduct(new Food("Cioccolata",0.85F,false));
		
		String startWithExpected = "Il signore degli anelli - BOOK: 12.49 Innuendo - MUSIC: 16.49 Cioccolata - FOOD: 0.85 TAXES: 1.50 TOTAL: 29.83";		
		/**
		 *  NOTA: Rimuovo "Se ti chiami ###NOME###" per evitare che il randomize sul nome faccia fallire i test.
		 */
		String containsExpected  = "hai vinto un buono da 50 euro";
		
		CartPrinter cartPrinter = new CartPrinter(cart, new ProductPrinter());	
		String bill = (String) cartPrinter.print();
		assertTrue(bill.startsWith(startWithExpected));
		assertTrue(bill.contains(containsExpected));
	}
	
	@Test
	void givenCart_whenBillHaveLuckyBonus_thenNameReplaceByRandomAPI() {
		Cart cart = new Cart();
		cart.setLuckyBonus(true);
		cart.addProduct(new Book("Il signore degli anelli",12.49F,false));
		cart.addProduct(new Music("Innuendo",14.99F,false));
		cart.addProduct(new Food("Cioccolata",0.85F,false));
		
		String startWithExpected = "Il signore degli anelli - BOOK: 12.49 Innuendo - MUSIC: 16.49 Cioccolata - FOOD: 0.85 TAXES: 1.50 TOTAL: 29.83";		
		String containsExpected  = "hai vinto un buono da 50 euro";
		/**
		 *  NOTA: Verifico che la fattura non presenti il "placeholder" "###NOME###".
		 */
		String notContainsExpected  = "###NOME###";
		
		CartPrinter cartPrinter = new CartPrinter(cart, new ProductPrinter());	
		String bill = (String) cartPrinter.print();
		assertTrue(bill.startsWith(startWithExpected));
		assertTrue(bill.contains(containsExpected));
		assertFalse(bill.contains(notContainsExpected));
	}
}
