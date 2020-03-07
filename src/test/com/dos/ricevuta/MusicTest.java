package test.com.dos.ricevuta;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import main.com.dos.ricevuta.products.Music;
import main.com.dos.ricevuta.products.Pharm;

class MusicTest {

	@Test
	void givenMusic_whenGetType_thenMusicIsReturned() {
		Music music = new Music();
		assertThat(music.getType(), Is.is("MUSIC"));
	}
	
}
