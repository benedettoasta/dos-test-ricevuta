package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Food;
import main.com.dos.ricevuta.products.Pharm;

class PharmTest {

	@Test
	void givenPharm_whenGetType_thenPharmIsReturned() {
		Pharm pharm = new Pharm();
		assertThat(pharm.getType(), Is.is("PHARM"));
	}
	
	@Test
	void givenPharmWithData_whenGetPriceTaxed_thenPriceTaxedReturn() {
		Pharm prod = new Pharm("tachipirina, 10 - compresse",8);
		float priceWithTax = 8F;
		assertThat(prod.getPriceTaxed(), Is.is(priceWithTax));
	}

	@Test
	void givenImportedPharmWithData_whenGetPriceTaxed_thenPriceTaxedWithFivePercPlusReturn() {
		Pharm prod = new Pharm("tachipirina, 10 - compresse",8,true);
		float priceWithTax = 8.4F;
		assertThat(prod.getPriceTaxed(), Is.is(priceWithTax));
	}	
	
}
