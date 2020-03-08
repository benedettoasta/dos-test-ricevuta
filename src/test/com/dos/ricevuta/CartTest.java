/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.Cart;
import main.com.dos.ricevuta.contracts.IProduct;
import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.products.Music;

/**
 * @author Benedetto
 *
 */
class CartTest {

	@Test
	void givenNewCart_whenCountItems_thenCartIsEmpty() {
		Cart cart = new Cart();
		assertThat(cart.countItems(),Is.is(0));
	}
	
	@Test
	void givenNewCart_whenAddProduct_thenCountReturnNumberOfItems() {
		Cart cart = new Cart();
		IProduct product = new Book();
		cart.addProduct(product);
		assertThat(cart.countItems(),Is.is(1));
	}
	
	@Test
	void givenCart_whenGetBillOnEmptyCart_thenEmptyBillReturn() {
		Cart cart = new Cart();
		assertThat(cart.getBill(),Is.is("TAXES: 0.00 TOTAL: 0.00"));
	}

	@Test
	void givenCart_whenGetBillOnNotEmptyCart_thenBillWithTotalsReturn() {
		Cart cart = new Cart();
		cart.addProduct(new Book("Il signore degli anelli",12.49F,false));
		cart.addProduct(new Music("Innuendo",14.99F,false));
		cart.addProduct(new Food("Cioccolata",0.85F,false));
		
		String resultExpected = "Il signore degli anelli - BOOK: 12.49 Innuendo - MUSIC: 16.49 Cioccolata - FOOD: 0.85 TAXES: 1.50 TOTAL: 29.83";
		assertThat(cart.getBill(),Is.is(resultExpected));
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
		
		String bill = cart.getBill();
		assertTrue(bill.startsWith(startWithExpected));
		assertTrue(bill.contains(containsExpected));
	}
}
