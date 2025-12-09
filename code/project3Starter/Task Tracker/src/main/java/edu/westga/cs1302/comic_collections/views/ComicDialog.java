package edu.westga.cs1302.comic_collections.views;

import edu.westga.cs1302.comic_collections.model.Comic;
import edu.westga.cs1302.comic_collections.viewmodel.Project3ViewModel;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

/**
 * Display for creating a new comic
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class ComicDialog extends Dialog<Comic> {
	 @FXML private Button addComic;
	 @FXML private Button cancel;
	 @FXML private TextField comicNameField;
	 @FXML private TextField issueNumberField;
	 
	 private Stage dialogStage;
	 private Project3ViewModel vm;
	 
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
	 
	private void bindUIElements() {
		this.comicNameField.textProperty().bindBidirectional(this.vm.getComicTitle());
		this.issueNumberField.textProperty().bindBidirectional(this.vm.getComicIssueNumber(), new NumberStringConverter());
	}
	
	private void bindBehavior() {
		this.addComic.setOnAction(
				(event) -> {
					this.vm.addNewComic();
				}
		);
		
		this.cancel.setOnAction(
				(event) -> {
					((Node) (this.addComic)).getScene().getWindow().hide();
				}
		);
	}
}
