package edu.westga.cs1302.comic_collections.model;

/** Stores Comics in a collection
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class ComicCollection {
	
	private String collectionName;
	
	/**
	 * Creates a comic collection
	 */
	public ComicCollection(String collectionName) {
		this.collectionName = collectionName;
	}
	
	/** Gets the name of the collection
	 * 
	 * @return the name of the collection
	 */
	public String getName() {
		return this.collectionName;
	}
}
