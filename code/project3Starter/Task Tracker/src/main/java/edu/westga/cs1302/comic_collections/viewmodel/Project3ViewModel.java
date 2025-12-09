package edu.westga.cs1302.comic_collections.viewmodel;

import java.util.ArrayList;
import java.util.HashMap;

import edu.westga.cs1302.comic_collections.model.Comic;
import edu.westga.cs1302.comic_collections.model.ComicCollection;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

/** ViewModel for Project 3
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class Project3ViewModel {
	
	private StringProperty collectionName;
	private ListProperty<ComicCollection> collectionList;
	private ObjectProperty<ComicCollection> selectedCollection;
	private HashMap<String, ComicCollection> collectionMap;
	private StringProperty comicTitle;
	private IntegerProperty comicIssueNumber;
	private ListProperty<Comic> comicsList;
	private ObjectProperty<Comic> selectedComic;
	
	/** Constructor for the ViewModel
	 * 
	 */
	public Project3ViewModel() {
		this.collectionName = new SimpleStringProperty("");
		this.collectionList = new SimpleListProperty<ComicCollection>(FXCollections.observableArrayList(new ArrayList<ComicCollection>()));
		this.selectedCollection = new SimpleObjectProperty<ComicCollection>();
		this.collectionMap = new HashMap<String, ComicCollection>();
		this.comicTitle = new SimpleStringProperty("");
		this.comicIssueNumber = new SimpleIntegerProperty(1);
		this.comicsList = new SimpleListProperty<Comic>(FXCollections.observableArrayList(new ArrayList<Comic>()));
		this.selectedComic = new SimpleObjectProperty<Comic>();
	}
	
	/** Gets the name of the collection to be made
	 * 
	 * @return the name of the collection to be made
	 */
	public StringProperty getCollectionName() {
		return this.collectionName;
	}
	
	/** Gets the HashMap of the collections
	 * 
	 * @return the collectionMap
	 */
	public HashMap<String, ComicCollection> getCollectionMap() {
		return this.collectionMap;
	}

	/** Gets the property of the title of the comic
	 * 
	 * @return the comicTitle
	 */
	public StringProperty getComicTitle() {
		return this.comicTitle;
	}

	/** Gets the property of the issue number of the comic
	 * 
	 * @return the comicIssueNumber
	 */
	public IntegerProperty getComicIssueNumber() {
		return this.comicIssueNumber;
	}

	/** Gets the property of the list of comics
	 * 
	 * @return the comicsList
	 */
	public ListProperty<Comic> getComicsList() {
		return this.comicsList;
	}

	/** Gets the property of the selected comic
	 * 
	 * @return the selectedComic
	 */
	public ObjectProperty<Comic> getSelectedComic() {
		return this.selectedComic;
	}

	/** Gets the list of comic collections
	 * 
	 * @return the list of comic collections
	 */
	public ListProperty<ComicCollection> getCollectionList() {
		return this.collectionList;
	}
	
	/** Gets the selected collection
	 * 
	 * @return the collection that was selected by the user
	 */
	public ObjectProperty<ComicCollection> getSelectedCollection() {
		return this.selectedCollection;
	}
	
	/** Creates a new comic collection
	 * 
	 */
	public void createCollection() throws IllegalArgumentException {
			ComicCollection newCollection = new ComicCollection(this.collectionName.get());
			this.collectionList.add(newCollection);
			this.collectionMap.put(this.collectionName.get(), newCollection);
	}
	
	/** Removes a collection from the list
	 * 
	 */
	public void removeCollection() {
		this.collectionList.remove(this.selectedCollection.get());
		this.collectionMap.remove(this.selectedCollection.getName());
	}
	
	/** Adds a new comic to the selected collection
	 * 
	 * 
	 */
	public void addNewComic() {
		this.selectedCollection.get().addComic(new Comic(this.comicTitle.get(), this.comicIssueNumber.get()));
	}
	
	/** Removes a comic from the selected collection
	 * 
	 */
	public void removeComic() {
		this.selectedCollection.get().getComics().remove(this.selectedComic.get());
	}
}
