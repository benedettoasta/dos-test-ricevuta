/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.Cart;

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

}
