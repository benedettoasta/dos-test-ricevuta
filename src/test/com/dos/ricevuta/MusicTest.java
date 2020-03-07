package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

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
	
	@Test
	void givenMusic_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Music music = new Music("Disco Innuendo",20,false);
		String result = "Disco Innuendo - MUSIC: 22.00";
		assertThat(music.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherMusic_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Music music = new Music("883 - Nord,sud,ovest,est",16,false);
		String result = "883 - Nord,sud,ovest,est - MUSIC: 17.60";
		assertThat(music.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenImportedMusic_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Music music = new Music("Disco Innuendo",20,true);
		String result = "Disco Innuendo - MUSIC: 23.00";
		assertThat(music.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherImportedMusic_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Music music = new Music("883 - Nord,sud,ovest,est",16,true);
		String result = "883 - Nord,sud,ovest,est - MUSIC: 18.40";
		assertThat(music.getProductFormattedRicevutaString(), Is.is(result));
	}
	
}
