package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Book;
import main.com.dos.ricevuta.products.Food;

class FoodTest {

	@Test
	void givenFood_whenGetType_thenFoodIsReturned() {
		Food food = new Food();
		assertThat(food.getType(), Is.is("FOOD"));
	}
	
	@Test
	void givenFood_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Food food = new Food("Cioccolata, calda",5,false);
		String result = "Cioccolata, calda - FOOD: 5.00";
		assertThat(food.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherFood_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Food food = new Food("Merenda al latte",20,false);
		String result = "Merenda al latte - FOOD: 20.00";
		assertThat(food.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenImportedFood_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Food food = new Food("Cioccolata, calda",5,true);
		String result = "Cioccolata, calda - FOOD: 5.25";
		assertThat(food.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherImportedFood_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Food food = new Food("Merenda al latte",20,true);
		String result = "Merenda al latte - FOOD: 21.00";
		assertThat(food.getProductFormattedRicevutaString(), Is.is(result));
	}
}
