package edu.westga.cs1302.comic_collections.model;

import java.util.ArrayList;

/** Stores Comics in a collection
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class ComicCollection {
	
	private String collectionName;
	private ArrayList<Comic> comics;
	
	/**
	 * Creates a comic collection
	 * 
	 * @precondition collectionName.isNotBlank && collectionName != null
	 * 
	 * @param collectionName the name of the collection
	 */
	public ComicCollection(String collectionName) {
		if (collectionName == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		if (collectionName.isBlank()) {
			throw new IllegalArgumentException("Name must not be blank");
		}
		
		this.collectionName = collectionName;
		this.comics = new ArrayList<Comic>();
	}
	
	/** Gets the name of the collection
	 * 
	 * @return the name of the collection
	 */
	public String getName() {
		return this.collectionName;
	}
	
	/** Gets the list of comics in the collection
	 * 
	 * @return the list of comics in the collection
	 */
	public ArrayList<Comic> getComics() {
		return this.comics;
	}
	
	/** Represents the collection as a string
	 * 
	 * @return the collection's name
	 */
	public String toString() {
		return this.collectionName;
	}
	
	/** Adds a comic to the collection
	 * 
	 * @precondition comic != null
	 * 
	 * @param comicToAdd the comic to be added to the collection
	 */
	public void addComic(Comic comicToAdd) {
		if (comicToAdd == null) {
			throw new IllegalArgumentException("Comic cannot be null");
		}
		
		this.comics.add(comicToAdd);
	}
}
