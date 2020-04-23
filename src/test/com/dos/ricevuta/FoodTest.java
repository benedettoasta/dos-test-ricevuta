package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Food;

class FoodTest {

	@Test
	void givenFood_whenGetType_thenFoodIsReturned() {
		Food food = new Food();
		assertThat(food.getType(), Is.is("FOOD"));
	}
	
	@Test
	void givenFoodWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		Food prod = new Food("Cioccolata, calda",5);
		float priceWithTax = 5F;
		assertThat(prod.getPriceTaxed(), Is.is(priceWithTax));
	}

	@Test
	void givenImportedFoodWithData_whenGetPriceTaxed_thenPriceTaxedWithFivePercPlusReturn() {
		Food prod = new Food("Cioccolata, calda",5,true);
		float priceWithTax = 5.25F;
		assertThat(prod.getPriceTaxed(), Is.is(priceWithTax));
	}	

}
