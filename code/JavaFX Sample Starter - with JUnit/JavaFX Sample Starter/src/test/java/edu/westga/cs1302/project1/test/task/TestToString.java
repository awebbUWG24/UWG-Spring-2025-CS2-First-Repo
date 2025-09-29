package edu.westga.cs1302.project1.test.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.project1.model.Task;

class TestToString {

	@Test
	void testWhenToStringRecievesNormalInput() {
		Task testTask = new Task("Homework", "Do my math HW", 3);
		
		assertEquals("Homework", testTask.toString());
	}

}
