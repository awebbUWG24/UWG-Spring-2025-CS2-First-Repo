package edu.westga.cs1302.task_tracker.model.namedescending;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.NameDescending;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestCompare {

	@Test
	void testWhenO1IsNull() {
		Task testTask2 = new Task("name", "desc", TaskPriority.HIGH);
		NameDescending descending = new NameDescending();
		
		assertThrows(IllegalArgumentException.class, () -> {
			descending.compare(null, testTask2);
		});
	}
	
	@Test
	void testWhenO2IsNull() {
		Task testTask1 = new Task("name", "desc", TaskPriority.HIGH);
		NameDescending descending = new NameDescending();
		
		assertThrows(IllegalArgumentException.class, () -> {
			descending.compare(testTask1, null);
		});
	}
	
	@Test
	void testWhenTasksHaveTheSameName() {
		Task testTask1 = new Task("name", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("name", "desc", TaskPriority.HIGH);
		NameDescending descending = new NameDescending();
		
		int testResult = descending.compare(testTask1, testTask2);
		
		assertEquals(0, testResult);
	}
	
	@Test
	void testWhenO1ComesFirst() {
		Task testTask1 = new Task("Homework", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("Cook", "desc", TaskPriority.HIGH);
		
		NameDescending descending = new NameDescending();
		
		int testResult = descending.compare(testTask1, testTask2);
		
		assertEquals(-1, testResult);
	}
	
	@Test
	void testWhenO2ComesFirst() {
		Task testTask1 = new Task("Cook", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("Homework", "desc", TaskPriority.HIGH);
		
		NameDescending descending = new NameDescending();
		
		int testResult = descending.compare(testTask1, testTask2);
		
		assertEquals(1, testResult);
	}

}
