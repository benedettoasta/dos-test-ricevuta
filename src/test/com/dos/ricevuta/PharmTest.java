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

}
