/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.ShopRegister;

/**
 * @author Benedetto
 *
 */
class ShopRegisterTest {

	@Test
	void givenShopRegister_whenNewInstance_thenCartsListIsEmpty() {
		ShopRegister shopRegister = new ShopRegister();
		assertThat(shopRegister.countItems(),Is.is(0));
	}

}
