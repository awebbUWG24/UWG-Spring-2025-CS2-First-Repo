package edu.westga.cs1302.project1.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import edu.westga.cs1302.project1.model.Task;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {
	
	@FXML
    private Button addTaskButton;
	
	@FXML
    private TextArea selectedTaskDesc;

	@FXML
    private TextField selectedTaskPrio;
	
	@FXML
    private TextArea taskDesc;

    @FXML
    private ListView<Task> taskList;

    @FXML
    private TextField taskName;

    @FXML
    private ComboBox<String> taskPrio;
    
    /**
     * Adding a new task to the taskList
     * 
     * @param event when the button is pressed.
     */
    @FXML
    public void addTask(ActionEvent event) {
    	try {
    		Task newTask = new Task(this.taskName.getText(), this.taskDesc.getText(), Integer.parseInt(this.taskPrio.getValue()));
    		this.taskList.getItems().add(newTask);
    	} catch (NumberFormatException exception) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setContentText("You must select a priority level.");
    		alert.showAndWait();
    	} catch (IllegalArgumentException exception) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setContentText(exception.getMessage());
    		alert.showAndWait();
    	} 
    	
    }
    
    @FXML
    void viewTask(MouseEvent event) {
    	this.selectedTaskDesc.setText(this.taskList.getSelectionModel().getSelectedItem().getTaskDescription());
    	this.selectedTaskPrio.setText(Integer.toString(this.taskList.getSelectionModel().getSelectedItem().getTaskPriority()));
    }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	String[] priorities = {"1", "2", "3"};
    	this.taskPrio.getItems().addAll(priorities);
    }
}
