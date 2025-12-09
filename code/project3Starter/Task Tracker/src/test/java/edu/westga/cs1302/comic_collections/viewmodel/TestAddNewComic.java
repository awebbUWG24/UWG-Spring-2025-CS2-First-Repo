package edu.westga.cs1302.comic_collections.viewmodel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.comic_collections.model.ComicCollection;

class TestAddNewComic {

	@Test
	void TestAddNewComicWithNormalInput() {
		Project3ViewModel testVM = new Project3ViewModel();
		testVM.getSelectedCollection().set(new ComicCollection("TestCollection"));
		testVM.getComicTitle().set("Superman");
		testVM.getComicIssueNumber().set(1212);
		
		testVM.addNewComic();
		
		assertEquals("Superman", testVM.getSelectedCollection().get().getComics().get(0).getComicName());
		assertEquals(1212, testVM.getSelectedCollection().get().getComics().get(0).getIssueNumber());
	}

}
