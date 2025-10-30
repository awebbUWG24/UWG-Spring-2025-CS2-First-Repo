package edu.westga.cs1302.task_tracker.model.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.ContainerTask;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestAddTask {

	@Test
	void testNullTask() {
		Task task = new Task("name", "desc", TaskPriority.HIGH);
		
		assertThrows(IllegalArgumentException.class, () -> {
			task.addTask(null);
		});
	}
	
	@Test
	void testValidArguments() {
		Task task = new Task("name", "desc", TaskPriority.HIGH);
		Task subTask = new Task("subName", "subDesc", TaskPriority.LOW);
		
		ContainerTask result = task.addTask(subTask);
		
		assertEquals("name" ,result.getName());
		assertEquals("desc", result.getDescription());
		assertEquals(TaskPriority.HIGH, result.getPriority());
		
		assertEquals("subName", result.getSubTasks().get(0).getName());
		assertEquals("subDesc", result.getSubTasks().get(0).getDescription());
		assertEquals(TaskPriority.LOW, result.getSubTasks().get(0).getPriority());
		
	}

}
