package edu.westga.cs1302.comic_collections.views;

import edu.westga.cs1302.comic_collections.model.ComicCollection;
import edu.westga.cs1302.comic_collections.viewmodel.Project3ViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/** Codebehind for Main window of comic collection application
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class MainWindow {

    @FXML private Button addCollection;
    @FXML private ListView<ComicCollection> collectionList;
    @FXML private TextField collectionName;
    @FXML private Button removeCollectionButton;
    @FXML private MenuItem removeCollectionMenuItem;
    
    private Project3ViewModel vm;
 
    @FXML
    void initialize() {
    	this.vm = new Project3ViewModel();
    	this.bindUIElements();
    	this.bindBehavior();
    }
    
    private void bindUIElements() {    	
    	this.collectionList.itemsProperty().bind(this.vm.getCollectionList());
    	this.vm.getSelectedCollection().bind(this.collectionList.getSelectionModel().selectedItemProperty());
    	this.collectionName.textProperty().bindBidirectional(this.vm.getCollectionName());
    	
    }
    
    private void bindBehavior() {
    	this.addCollection.setOnAction(
    			(ActionEvent event) -> {
    				this.vm.createCollection();
    			}
    	);
    	
    	this.addCollection.disableProperty().bind(this.collectionName.textProperty().isEmpty());
    	
    	this.removeCollectionButton.setOnAction((event) -> { 
    		this.vm.removeCollection();
    	});
    }

}
