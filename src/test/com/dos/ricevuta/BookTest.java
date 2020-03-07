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

}
