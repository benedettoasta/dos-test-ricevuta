package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.products.Music;

class MusicTest {

	@Test
	void givenMusic_whenGetType_thenMusicIsReturned() {
		Music music = new Music();
		assertThat(music.getType(), Is.is("MUSIC"));
	}
	
	@Test
	void givenMusicWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		String descrizione = "Disco Innuendo";
		float price = 20;
		float priceWithTax = 22;
		Music music = new Music(descrizione,price);
		assertThat(music.getPriceTaxed(), Is.is(priceWithTax));
	}
	
	@Test
	void givenImportedMusicWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		String descrizione = "Disco Innuendo";
		float price = 20;
		float priceWithTax = 23;
		Music music = new Music(descrizione,price,true);
		assertThat(music.getPriceTaxed(), Is.is(priceWithTax));
	}	
}
