package edu.westga.cs1302.project1.test.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.project1.model.Task;

class TestConstructor {

	@Test
	public void testWhenConstructorRecievesNormalInput() {
		Task testTask = new Task("Homework", "Do my math HW", 3);
		
		assertEquals("Homework", testTask.getTaskName() );
		assertEquals("Do my math HW", testTask.getTaskDescription());
		assertEquals(3, testTask.getTaskPriority());
	}
	
	@Test
	public void testWhenTaskNameIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Do my math HW", 3);
		});
	}
	
	@Test
	public void testWhenTaskNameIsBlank() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("   ", "Do my math HW", 3);
		});
	}
	
	@Test
	public void testWhenTaskDescriptionIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Homework", null, 3);
		});
	}
	
	@Test
	public void testWhenTaskDescriptionIsEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Homework", "   ", 3);
		});
	}
		
	@Test
	public void testWhenTaskPriorityIsLessThanOne() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Homework", "Do my math HW", 0);
		});
	}
	
	@Test
	public void testWhenTaskPriorityIsGreaterThanThree() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("Homework", "Do my math HW", 4);
		});
	}
}
