package edu.westga.cs1302.password_generator.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.westga.cs1302.password_generator.viewmodel.ViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/** Codebehind for the MainWindow of the Application.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {

    @FXML private CheckBox mustIncludeDigits;
    @FXML private CheckBox mustIncludeLowerCaseLetters;
    @FXML private CheckBox mustIncludeUpperCaseLetters;
    @FXML private TextField minimumLength;
    @FXML private Label errorTextLabel;
    @FXML private Label minLengthErrorText;
    @FXML private Button generatePasswordButton;
    @FXML private ListView<String> passwordHistory;
    @FXML private MenuBar passwordMenuBar;
    @FXML private MenuItem fileAbout;
    @FXML private MenuItem fileClose;
    @FXML private MenuItem fileSave;
    @FXML private AnchorPane generatorPane;
    
    private ViewModel vm;
    
    @FXML
    void initialize() {
    	this.vm = new ViewModel();
    	this.vm.getRequireDigits().bind(this.mustIncludeDigits.selectedProperty());
    	this.vm.getRequireLowercase().bind(this.mustIncludeLowerCaseLetters.selectedProperty());
    	this.vm.getRequireUppercase().bind(this.mustIncludeUpperCaseLetters.selectedProperty());
    	this.minimumLength.setText(this.vm.getMinimumLength().getValue());
    	this.vm.getMinimumLength().bind(this.minimumLength.textProperty());
    	
    	this.errorTextLabel.textProperty().bind(this.vm.getErrorText());
    	this.passwordHistory.setItems(this.vm.getPasswordHistory());
    	
    	this.minimumLength.textProperty().addListener((observable, oldValue, newValue) -> {
    		this.minLengthErrorText.setVisible(!newValue.matches("\\d+") || Integer.parseInt(newValue) == 0);
    	});
    	
    	this.generatePasswordButton.setOnAction(
    			(event) -> { 
    				this.vm.generatePassword();
    			} 
    	);
    }
    
    @FXML
    void aboutStatement(ActionEvent event) {
    	Alert aboutStatement = new Alert(AlertType.INFORMATION);
    	aboutStatement.setContentText("Author: Aiden Webb" + System.lineSeparator() 
    		+ "This project is Lab 9 of CS 1302. We're doing this to show understanding of using menu bars and enabling and disabling buttons");
    	aboutStatement.showAndWait();
    }

    @FXML
    void closeWindow(ActionEvent event) {
    	((Node) (this.generatePasswordButton)).getScene().getWindow().hide();
    }

    @FXML
    void savePasswords(ActionEvent event) {
    	 FileChooser fileChooser = new FileChooser();
    	 fileChooser.setTitle("Choose a file to save to");
    	 fileChooser.getExtensionFilters().addAll(
    			 new ExtensionFilter("Text Files", "*.txt"),
    			 new ExtensionFilter("All Files", "*.*"));
    	 
    	 Stage stage = (Stage) this.generatorPane.getScene().getWindow();
    	 File selectedFile = fileChooser.showOpenDialog(stage);
    	 if (selectedFile != null) {
    		 try (FileWriter writer = new FileWriter(selectedFile)) {
    			 for (String currPassword : this.passwordHistory.getItems()) {
    				 writer.write(currPassword + System.lineSeparator());
    			 }
    		 } catch (IOException exception) {
    			 Alert alert = new Alert(AlertType.ERROR);
    			 alert.setContentText("Could not write to file");
    			 alert.showAndWait();
			}
    		 
    	 }
    }
    
}
