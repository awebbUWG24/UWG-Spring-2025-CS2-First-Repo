package edu.westga.cs1302.bill.test.model.billcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestCalculateTax {

	@Test
	void testCalculateTaxWhenBillIsNull() {
		Bill testBill = null;
		
		assertThrows(NullPointerException.class, () -> {
			BillCalculator.calculateSubtotal(testBill);
		});
	}
	
	@Test
	void testCalculateSubtotalWhenBillRecievesNormalInput() {
		Bill testBill = new Bill();
		BillItem chicken = new BillItem("Chicken", 5.0);
		BillItem apple = new BillItem("Apple", 3.0);
		
		testBill.addItem(chicken);
		testBill.addItem(apple);
		
		double result = BillCalculator.calculateTax(testBill);
		
		assertEquals(result, 0.8, 0.001);
	}

}
