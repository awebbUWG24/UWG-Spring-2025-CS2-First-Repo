package edu.westga.cs1302.project1.test.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.project1.model.Task;

class TestSetDescription {
	
	@Test
	public void testWhenMethodRecievesNormalInput() {
		Task testTask = new Task("Homework", "Do my math HW", 3);
		testTask.setDescription("Do my science HW");
		
		assertEquals("Do my science HW", testTask.getTaskDescription());
	}

	@Test
	public void testWhenTaskDescriptionIsNull() {
		Task testTask = new Task("Homework", "lorem ipsum", 3);
		assertThrows(IllegalArgumentException.class, () -> {
			testTask.setDescription(null);
		});
	}
	
	@Test
	public void testWhenTaskDescriptionIsEmpty() {
		Task testTask = new Task("Homework", "lorem ipsum", 3);
		assertThrows(IllegalArgumentException.class, () -> {
			testTask.setDescription("  ");
		});
	}

}
