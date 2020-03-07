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

}
