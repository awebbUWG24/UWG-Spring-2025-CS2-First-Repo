package edu.westga.cs1302.lab1.view;

import edu.westga.cs1302.lab1.model.BillItem;
import edu.westga.cs1302.lab1.model.Bill;

/** Displays the list of items in a bill
 * 
 * @author Aiden_Webb CS1302
 * @version Fall 2025
 */
public class BillView {
	
	private static final double BILL_TAX = 0.1;
	private static final double BILL_TIP = 0.2;
	private Bill itemList = new Bill();
	
	/** Return a String containing the list of bill items and total for the bill.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return a String containing the list of bill items and total for the bill
	 */
	public String getText() {
		String text = "ITEMS" + System.lineSeparator();
		double subTotal = 0.0;
		for (BillItem item : this.itemList.getItems()) {
			text += item.getName() + " - " + item.getAmount() + System.lineSeparator();
			subTotal += item.getAmount();
		}
		
		text += System.lineSeparator();
		text += "SUBTOTAL - $" + subTotal + System.lineSeparator();
		double tax = subTotal * BILL_TAX;
		double tip = subTotal * BILL_TIP;
		text += "TAX - $" + tax + System.lineSeparator();
		text += "TIP - $" + tip + System.lineSeparator();
		text += "TOTAL - $" + (subTotal + tip + tax);
		
		return text;
	}

}