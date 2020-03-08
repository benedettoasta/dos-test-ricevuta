/**
 * 
 */
package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.Cart;
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
	
	@Test
	void givenShopRegister_whenAddCart_thenCartsListHasItem() {
		ShopRegister shopRegister = new ShopRegister();
		shopRegister.addCart(new Cart());
		
		assertThat(shopRegister.countItems(),Is.is(1));
	}
	
	@Test
	void givenShopRegister_whenAddTenCartInstance_thenCartInstanceIsLuckyBonus() {
		ShopRegister shopRegister = new ShopRegister();
		for(int i = 0; i<10; i++) {	
			shopRegister.addCart(new Cart());
		}
		Cart lastCart = shopRegister.getLastCart();
		
		assertTrue(lastCart.isLuckyBonus());
	}

	@Test
	void givenShopRegisterWithALotCarts_whenAddTenMultipleCartInstance_thenTheseCartInstancesAreLuckyBonus() {
		ShopRegister shopRegister = new ShopRegister();
		for(int i = 1; i < 35; i++) {	
			Cart tmpCart = new Cart();
			shopRegister.addCart(tmpCart);
			
			boolean expetctedIsLuckyBonus = false;
			if(i==10 || i==20 || i==30) {
				expetctedIsLuckyBonus = true;				
			}
			assertThat(tmpCart.isLuckyBonus(),Is.is(expetctedIsLuckyBonus));
		}
	}
}
