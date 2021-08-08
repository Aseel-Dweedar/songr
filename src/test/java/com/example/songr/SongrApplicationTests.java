package com.example.songr;

import models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {

	@Test public void albumConstructor(){

		Album testAlbum = new Album("Thank you Allah" , "Maher zain" , 10 , 2500 , "https://i.ytimg.com/vi/BfStqxizSDM/maxresdefault.jpg");

		/* Test Constructor */
		assertTrue(testAlbum instanceof Album);

		/* Test title setter and getter */
		testAlbum.setTitle("dreams");
		assertEquals("dreams", testAlbum.getTitle());

		/* Test artist setter and getter */
		testAlbum.setArtist("Aseel");
		assertEquals("Aseel", testAlbum.getArtist());

		/* Test number of songs setter and getter */
		testAlbum.setSongCount(5);
		assertEquals(5, testAlbum.getSongCount());

		/* Test length setter and getter */
		testAlbum.setLength(3000);
		assertEquals(3000, testAlbum.getLength());

		/* Test image setter setter and getter */
		testAlbum.setImageUrl("none");
		assertEquals("none", testAlbum.getImageUrl());
	}
}
