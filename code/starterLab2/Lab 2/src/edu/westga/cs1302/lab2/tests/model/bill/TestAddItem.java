package edu.westga.cs1302.lab2.tests.model.bill;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab2.model.Bill;
import edu.westga.cs1302.lab2.model.BillItem;

class TestAddItem {

	@Test
	public void testAddItemWhenItemIsValid() {
		BillItem testItem = new BillItem("Chicken", 5.0);
		BillItem testItem2 = new BillItem("Apple", 2.0);
		Bill testBill = new Bill();
		
		testBill.addItem(testItem);
		testBill.addItem(testItem2);
		String resultName = testBill.getItems().get(0).getName();
		double resultAmount = testBill.getItems().get(0).getAmount();
		
		assertEquals("Chicken", resultName);
		assertEquals(5.0, resultAmount, 0.001);
	}
	
	@Test
	public void testAddItemWhenItemIsNull() {
		Bill testBill = new Bill();
		
		assertThrows(IllegalArgumentException.class,
				() -> {
					testBill.addItem(null);
				}
				);
	}

}
