package edu.westga.cs1302.comic_collections.views;

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

    @FXML private Button addCollectionButton;
    @FXML private ListView<?> collectionList;
    @FXML private TextField collectionName;
    @FXML private Button removeCollectionButton;
    @FXML private MenuItem removeCollectionMenuItem;
    
    @FXML
    void addCollection(ActionEvent event) {

    }

    @FXML
    void removeCollection(ActionEvent event) {

    }
    
    @FXML
    void intialize() {
    	
    }

}
