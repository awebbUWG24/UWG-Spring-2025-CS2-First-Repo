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
	
	/** Calculates a tax for a given bill.
	 * 
	 * @precondition bill != null
	 * 
	 * @param bill the bill of items that the tax will calculate
	 * @return the tax of the bill
	 */
	public static double calculateTax(Bill bill) {
		if (bill == null) {
			throw new NullPointerException("Bill cannot be null.");
		}
		
		double subtotal = calculateSubtotal(bill);
		
		double tax = subtotal * Bill.TAX_RATE;
		
		return tax;
	}
	
	/** Calculates a tip for a given bill.
	 * 
	 * @precondition bill != null
	 * 
	 * @param bill the bill of items that the tip will calculate
	 * @return the tip of the bill
	 */
	public static double calculateTip(Bill bill) {
		if (bill == null) {
			throw new NullPointerException("Bill cannot be null.");
		}
		
		double subtotal = calculateSubtotal(bill);
		
		double tip = subtotal * Bill.TIP_RATE;
		
		return tip;
	}
	
	/** Calculates a total for a given bill.
	 * 
	 * @precondition bill != null
	 * 
	 * @param bill the bill of items that the total will calculate
	 * @return the total of the bill
	 */
	public static double calculateTotal(Bill bill) {
		if (bill == null) {
			throw new NullPointerException("Bill cannot be null.");
		}
		
		double subtotal = calculateSubtotal(bill);
		double tax = calculateTax(bill);
		double tip = calculateTip(bill);
		
		double total = subtotal + tax + tip;
		
		return total;
	}
			
}
