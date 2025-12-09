package edu.westga.cs1302.comic_collections.viewmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCreateCollection {

	@Test
	void TestCreateCollectionsNormalConditions() {
		Project3ViewModel testVM = new Project3ViewModel();
		
		testVM.getCollectionName().set("Testing");
		testVM.createCollection();
		
		assertEquals("Testing", testVM.getCollectionList().get(0).getName());
	}
	
	@Test
	void TestCreateCollectionWhenNameIsEmpty() {
		Project3ViewModel testVM = new Project3ViewModel();
		
		assertThrows(IllegalArgumentException.class, () -> {
			testVM.createCollection();
		});
	}

}
