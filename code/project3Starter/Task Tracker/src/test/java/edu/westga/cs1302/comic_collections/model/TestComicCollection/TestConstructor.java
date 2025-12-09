package edu.westga.cs1302.comic_collections.model.TestComicCollection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.comic_collections.model.ComicCollection;

class TestConstructor {

	@Test
	void TestWhenNameHasNormalInput() {
		ComicCollection testCollection = new ComicCollection("Testing");
		
		assertEquals("Testing", testCollection.getName());
	}
	
	@Test
	void TestWhenNameIsBlank() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ComicCollection("");
		});
	}
	
	@Test
	void TestWhenNameIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ComicCollection(null);
		});
	}

}
