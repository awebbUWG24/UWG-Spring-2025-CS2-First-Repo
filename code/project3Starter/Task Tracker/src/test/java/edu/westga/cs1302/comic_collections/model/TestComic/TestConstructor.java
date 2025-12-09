package edu.westga.cs1302.comic_collections.model.TestComic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.comic_collections.model.Comic;

class TestConstructor {

	@Test
	void TestConstructorWhenInputIsValid() {
		Comic testComic = new Comic("Superman", 1212);
		
		assertEquals("Superman", testComic.getComicName());
		assertEquals(1212, testComic.getIssueNumber());
	}
	
	@Test
	void TestConstructorWhenNameIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Comic(null, 1212);
		});
	}
	
	@Test
	void TestConstructorWhenNameIsEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Comic("", 1212);
		});
	}
	
	@Test
	void TestConstructorWhenIssueNumberIsLessThan1() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Comic("Superman", 0);
		});
	}

}
