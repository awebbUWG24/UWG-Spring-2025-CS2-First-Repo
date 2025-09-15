package edu.westga.cs1302.bill.test.model.billcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillCalculator;
import edu.westga.cs1302.bill.model.BillItem;

class TestCalculateTip {

	@Test
	void testCalculateTipWhenBillIsNull() {
		Bill testBill = null;
		
		assertThrows(NullPointerException.class, () -> {
			BillCalculator.calculateTip(testBill);
		});
	}
	
	@Test
	void testCalculateSubtotalWhenBillRecievesNormalInput() {
		Bill testBill = new Bill();
		BillItem chicken = new BillItem("Chicken", 5.0);
		BillItem apple = new BillItem("Apple", 3.0);
		
		testBill.addItem(chicken);
		testBill.addItem(apple);
		
		double result = BillCalculator.calculateTip(testBill);
		
		assertEquals(result, 1.6, 0.001);
	}

}
