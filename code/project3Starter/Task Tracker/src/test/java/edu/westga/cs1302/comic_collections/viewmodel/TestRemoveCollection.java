package edu.westga.cs1302.comic_collections.viewmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRemoveCollection {

	@Test
	void TestRemoveCollectionNormalConditons() {
		Project3ViewModel testVM = new Project3ViewModel();
		testVM.getCollectionName().set("Testing");
		testVM.createCollection();
		
		testVM.getSelectedCollection().set(testVM.getCollectionList().get(0));
		testVM.removeCollection();
		
		assertTrue(testVM.getCollectionList().isEmpty());
	}
}
