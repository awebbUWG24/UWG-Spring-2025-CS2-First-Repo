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
	}
	
	/** Gets the name of the collection
	 * 
	 * @return the name of the collection
	 */
	public String getName() {
		return this.collectionName;
	}
	
	/** Represents the collection as a string
	 * 
	 * @return the collection's name
	 */
	public String toString() {
		return this.collectionName;
	}
}
