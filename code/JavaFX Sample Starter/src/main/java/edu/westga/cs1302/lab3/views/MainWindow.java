package edu.westga.cs1302.lab3.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import edu.westga.cs1302.lab3.model.Bill;
import edu.westga.cs1302.lab3.model.BillItem;

/**
 * Controller class for drawing various things to our canvas window.
 * 
 * @author CS 1302
 * @version Fall 2025
 */
public class MainWindow {
	private Bill billItems = new Bill();
	
    @FXML
    private TextField amount;

    @FXML
    private TextField name;
    
    @FXML
    private TextArea billDisplay;
    
    /** Add a created item to the bill and update the bill to match
     *
     * @param event on button press
     * 
     */
    @FXML
    void addItem(ActionEvent event) {
    	
    	try {
    		String newItemName = this.name.getText();
        	double newItemPrice = Double.parseDouble(this.amount.getText());
        	
        	BillItem newItem = new BillItem(newItemName, newItemPrice);
        	
        	this.billItems.addItem(newItem);
        	
        	billDisplay.setText(BillView.getText(billItems));
    	}
    	catch(NumberFormatException e) {
    		Alert alert = new Alert(Alert.AlertType.ERROR);
    		alert.setContentText("Invalid amount. Please input a positive non zero number.");
    		alert.showAndWait();
    	}
    	
    }
    
    /**
     * Perform any needed initialization of UI components and underlying objects.
     */
    public void initialize() {
    	
    }
    
}
