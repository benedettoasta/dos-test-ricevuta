package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.GenericProduct;

class GenericProductTest {

	@Test
	void givenGenericProduct_whenGetType_thenGenericIsReturned() {
		GenericProduct genericProduct = new GenericProduct();
		assertThat(genericProduct.getType(), Is.is("GENERIC"));
	}

}
