package edu.westga.cs1302.task_tracker.model.containertask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.ContainerTask;
import edu.westga.cs1302.task_tracker.model.Task;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestAddTask {

	@Test
	void testNullTask() {
		Task task = new Task("name", "desc", TaskPriority.HIGH);
		Task subTask = new Task("subName", "subDesc", TaskPriority.LOW);
		
		ContainerTask containTask = task.addTask(subTask);
		
		assertThrows(IllegalArgumentException.class, () -> {
			containTask.addTask(null);
		});
	}
	
	@Test
	void testValidArguments() {
		Task task = new Task("name", "desc", TaskPriority.HIGH);
		Task subTask1 = new Task("subName1", "subDesc1", TaskPriority.LOW);
		Task subTask2 = new Task("subName2", "subDesc2", TaskPriority.MEDIUM);
		
		ContainerTask containTask = task.addTask(subTask1);
		containTask.addTask(subTask2);
		
		assertEquals("name" ,containTask.getName());
		assertEquals("desc", containTask.getDescription());
		assertEquals(TaskPriority.HIGH, containTask.getPriority());
		
		assertEquals("subName1", containTask.getSubTasks().get(0).getName());
		assertEquals("subDesc1", containTask.getSubTasks().get(0).getDescription());
		assertEquals(TaskPriority.LOW, containTask.getSubTasks().get(0).getPriority());
		
		assertEquals("subName2", containTask.getSubTasks().get(1).getName());
		assertEquals("subDesc2", containTask.getSubTasks().get(1).getDescription());
		assertEquals(TaskPriority.MEDIUM, containTask.getSubTasks().get(1).getPriority());
	}

}
