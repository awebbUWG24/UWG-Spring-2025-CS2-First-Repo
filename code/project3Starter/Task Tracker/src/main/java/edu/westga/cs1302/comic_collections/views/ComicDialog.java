package edu.westga.cs1302.comic_collections.views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Display for creating a new comic
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class ComicDialog extends Dialog<Comic>{
	 @FXML private Button addComic;
	 @FXML private Button cancel;
	 @FXML private TextField comicNameField;
	 @FXML private TextField issueNumberField;
	 
	 private Stage dialogStage;
	 
	 @FXML
	 private void initialize() {
		 
	 }

	 /**
	  * Sets the stage of this dialog.
	  * 
	  * @param dialogStage the stage for the dialogPane
	  */
	 public void setDialogStage(Stage dialogStage) {
		 this.dialogStage = dialogStage;
	 }
}
