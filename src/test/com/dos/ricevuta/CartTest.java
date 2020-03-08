/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.Cart;
import main.com.dos.ricevuta.contracts.IProduct;
import main.com.dos.ricevuta.products.Book;

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

}
