package edu.westga.cs1302.task_tracker.model.containertask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.ContainerTask;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestToString {

	@Test
	void testValidArguments() {
		Task task = new Task("name", "desc", TaskPriority.HIGH);
		Task subTask = new Task("subName", "subDesc", TaskPriority.LOW);
		
		ContainerTask containTask = task.addTask(subTask);
		
		String result = containTask.toString();
		
		assertEquals("name (+)", result);
	}

}
