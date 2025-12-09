package edu.westga.cs1302.comic_collections.model.TestComicCollection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.comic_collections.model.Comic;
import edu.westga.cs1302.comic_collections.model.ComicCollection;

class TestAddComic {

	@Test
	void TestAddComicWhenComicIsValid() {
		ComicCollection testCollection = new ComicCollection("TestCollection");
		Comic testComic = new Comic("Superman", 1212);
		testCollection.addComic(testComic);
		
		assertEquals("Superman", testCollection.getComics().get(0).getComicName());
		assertEquals(1212, testCollection.getComics().get(0).getIssueNumber());
	}
	
	@Test
	void TestAddComicWhenComicIsNull() {
		ComicCollection testCollection = new ComicCollection("TestCollection");
		
		assertThrows(IllegalArgumentException.class, () -> {
			testCollection.addComic(null);
		});
	}

}
