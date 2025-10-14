package edu.westga.cs1302.task_tracker.model.ascending;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.Ascending;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestCompare {

	@Test
	void testWhenATaskIsNull() {
		Task task1 = new Task("Homework", "Do your math and science homework", TaskPriority.LOW);
		Task task2 = null;
		
		Ascending taskOrder = new Ascending();
		
		assertThrows(IllegalArgumentException.class, () -> {
			taskOrder.compare(task1, task2);
		});
	}
	
	@Test
	void testCompareWhenAIsHigherThanB() {
		Task task1 = new Task("Homework", "Do your math and science homework", TaskPriority.HIGH);
		Task task2 = new Task("Cook dinner", "Make dinner for the week", TaskPriority.MEDIUM);
		Ascending taskOrder = new Ascending();
		
		int result = taskOrder.compare(task1, task2);
		
		assertEquals(1, result);
	}
	
	@Test
	void testCompareWhenAIsLowerThanB() {
		Task task1 = new Task("Homework", "Do your math and science homework", TaskPriority.HIGH);
		Task task2 = new Task("Cook dinner", "Make dinner for the week", TaskPriority.MEDIUM);
		Ascending taskOrder = new Ascending();
		
		int result = taskOrder.compare(task2, task1);
		
		assertEquals(-1, result);
	}
	
	@Test
	void testCompareWhenAIsEqualToB() {
		Task task1 = new Task("Homework", "Do your math and science homework", TaskPriority.MEDIUM);
		Task task2 = new Task("Cook dinner", "Make dinner for the week", TaskPriority.MEDIUM);
		Ascending taskOrder = new Ascending();
		
		int result = taskOrder.compare(task1, task2);
		
		assertEquals(0, result);
	}

}
