package edu.westga.cs1302.bill.model;

/** Calculates subtotal, tax, tip, and total for a bill.
 * 
 * @author Aiden Webb
 * @version Fall 2025
 */
public class BillCalculator {
	
	/** Calculates a subtotal for a given bill.
	 * 
	 * @precondition bill != null
	 * 
	 * @param bill the bill of items that the subtotal will calculate
	 * @return the subtotal of the bill
	 */
	public static double calculateSubtotal(Bill bill) {
		if (bill == null) {
			throw new NullPointerException("Bill cannot be null.");
		}
		
		double subtotal = 0;
		
		for (BillItem currItem : bill.getItems()) {
			if (currItem == null) {
				throw new IllegalArgumentException("No item within the bill can be null.");
			} else {
				subtotal += currItem.getAmount();
			}
		}
		return subtotal;
	}
}
