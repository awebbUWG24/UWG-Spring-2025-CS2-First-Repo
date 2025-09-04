package edu.westga.cs1302.lab2.tests.model.bill_item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.westga.cs1302.lab2.model.BillItem;

import org.junit.jupiter.api.Test;

class TestConstructor {
	
	@Test
	public void TestConstructorWhenInputIsExpectedTypes() {
		String name = "Chicken";
		double price = 5.0;
		
		BillItem testItem = new BillItem(name, price);
		String resultName = testItem.getName();
		double resultAmount = testItem.getAmount();
		
		assertEquals("Chicken", resultName);
		assertEquals(5.0, resultAmount, 0.001);
	}
	
	@Test
	public void TestConstructorWhenNameIsNull () {
		assertThrows(IllegalArgumentException.class,
				() -> {
					new BillItem(null, 5.0);
				}
				);
	}
	
	@Test
	public void TestConstructorWhenAmountIsZero () {
		assertThrows(IllegalArgumentException.class,
				() -> {
					new BillItem("Chicken", 0.0);
				}
				);
	}

}
