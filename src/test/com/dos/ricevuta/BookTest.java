package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.Book;

class BookTest {

	@Test
	void givenBook_whenGetType_thenBookIsReturned() {
		Book book = new Book();
		assertThat(book.getType(), Is.is("BOOK"));
	}

	@Test
	void givenBookWithoutData_whenGetDescription_thenEmptyStringReturn() {
		Book book = new Book();
		assertThat(book.getDescription(), Is.is(""));
	}
	

	@Test
	void givenBookWithoutData_whenGetPrice_thenZeroValueReturn() {
		Book book = new Book();
		assertThat(book.getPrice(), Is.is((float)0));
	}
}
