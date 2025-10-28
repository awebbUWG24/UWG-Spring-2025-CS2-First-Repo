package edu.westga.cs1302.task_tracker.model.nameascending;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.NameAscending;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestCompare {

	@Test
	void testWhenO1IsNull() {
		Task testTask2 = new Task("name", "desc", TaskPriority.HIGH);
		NameAscending ascending = new NameAscending();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ascending.compare(null, testTask2);
		});
	}
	
	@Test
	void testWhenO2IsNull() {
		Task testTask1 = new Task("name", "desc", TaskPriority.HIGH);
		NameAscending ascending = new NameAscending();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ascending.compare(testTask1, null);
		});
	}
	
	@Test
	void testWhenTasksHaveTheSameName() {
		Task testTask1 = new Task("name", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("name", "desc", TaskPriority.HIGH);
		NameAscending ascending = new NameAscending();
		
		int testResult = ascending.compare(testTask1, testTask2);
		
		assertEquals(0, testResult);
	}
	
	@Test
	void testWhenO1ComesFirst() {
		Task testTask1 = new Task("Cooking", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("Homework", "desc", TaskPriority.HIGH);
		
		NameAscending ascending = new NameAscending();
		
		int testResult = ascending.compare(testTask1, testTask2);
		
		assertEquals(-1, testResult);
	}
	
	@Test
	void testWhenO2ComesFirst() {
		Task testTask1 = new Task("Cooking", "desc", TaskPriority.HIGH);
		Task testTask2 = new Task("Adding Practice", "desc", TaskPriority.HIGH);
		
		NameAscending ascending = new NameAscending();
		
		int testResult = ascending.compare(testTask1, testTask2);
		
		assertEquals(1, testResult);
	}

}
