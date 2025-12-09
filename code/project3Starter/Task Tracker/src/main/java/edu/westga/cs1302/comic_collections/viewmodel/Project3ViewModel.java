package edu.westga.cs1302.comic_collections.viewmodel;

import java.util.ArrayList;
import java.util.HashMap;

import edu.westga.cs1302.comic_collections.model.ComicCollection;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

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
	
	/** Constructor for the ViewModel
	 * 
	 */
	public Project3ViewModel() {
		this.collectionName = new SimpleStringProperty("");
		this.collectionList = new SimpleListProperty<ComicCollection>(FXCollections.observableArrayList(new ArrayList<ComicCollection>()));
		this.selectedCollection = new SimpleObjectProperty<ComicCollection>();
		this.collectionMap = new HashMap<String, ComicCollection>();
	}
	
	/** Gets the name of the collection to be made
	 * 
	 * @return the name of the collection to be made
	 */
	public StringProperty getCollectionName() {
		return this.collectionName;
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
	public void createCollection() {
		try {
			ComicCollection newCollection = new ComicCollection(this.collectionName.get());
			this.collectionList.add(newCollection);
			this.collectionMap.put(this.collectionName.get(), newCollection);
		} catch (IllegalArgumentException error) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText(error.getMessage());
			alert.showAndWait();
		}
	}
	
	/** Removes a collection from the list
	 * 
	 */
	public void removeCollection() {
		this.collectionList.remove(this.selectedCollection.get());
		this.collectionMap.remove(this.selectedCollection.getName());
	}
}
