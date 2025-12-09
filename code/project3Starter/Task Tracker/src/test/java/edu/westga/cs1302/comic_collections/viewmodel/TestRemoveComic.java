package edu.westga.cs1302.comic_collections.viewmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.comic_collections.model.ComicCollection;

class TestRemoveComic {

	@Test
	void TestRemoveComicNormalConditions() {
		Project3ViewModel testVM = new Project3ViewModel();
		testVM.getSelectedCollection().set(new ComicCollection("TestCollection"));
		testVM.getComicTitle().set("Superman");
		testVM.getComicIssueNumber().set(1212);
		
		testVM.addNewComic();
		testVM.getSelectedComic().set(testVM.getSelectedCollection().get().getComics().get(0));
		testVM.removeComic();
		
		assertTrue(testVM.getCollectionList().size() == 0);
	}

}
