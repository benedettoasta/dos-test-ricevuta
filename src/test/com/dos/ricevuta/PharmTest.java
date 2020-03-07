package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Pharm;

class PharmTest {

	@Test
	void givenPharm_whenGetType_thenPharmIsReturned() {
		Pharm pharm = new Pharm();
		assertThat(pharm.getType(), Is.is("PHARM"));
	}
	
	@Test
	void givenPharm_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Pharm pharm = new Pharm("tachipirina, 10 - compresse",8,false);
		String result = "tachipirina, 10 - compresse - PHARM: 8.00";
		assertThat(pharm.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherPharm_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Pharm pharm = new Pharm("oki task",(float)12.5,false);
		String result = "oki task - PHARM: 12.50";
		assertThat(pharm.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenImportedPharm_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Pharm pharm = new Pharm("tachipirina, 10 - compresse",8,true);
		String result = "tachipirina, 10 - compresse - PHARM: 8.40";
		assertThat(pharm.getProductFormattedRicevutaString(), Is.is(result));
	}
	
	@Test
	void givenAnotherImportedPharm_whenGetStringRicevuta_thenStringForRicevutaReturn() {
		Pharm pharm = new Pharm("oki task",(float)12.5,true);
		String result = "oki task - PHARM: 13.13";
		assertThat(pharm.getProductFormattedRicevutaString(), Is.is(result));
	}

}
