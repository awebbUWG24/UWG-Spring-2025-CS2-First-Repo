package edu.westga.cs1302.task_tracker.model.containertask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.task_tracker.model.ContainerTask;
import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

class TestConstructor {

	@Test
	void testNullName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContainerTask(null, "desc", TaskPriority.HIGH);
		});
	}

	@Test
	void testEmptyName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContainerTask("", "desc", TaskPriority.HIGH);
		});
	}

	@Test
	void testNullDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContainerTask("name", null, TaskPriority.HIGH);
		});
	}

	@Test
	void testNullPriority() {
		assertThrows(IllegalArgumentException.class, () -> {
			new ContainerTask("name", "desc", null);
		});
	}

	@Test
	void testValidArguments() {
		ContainerTask result = new ContainerTask("name", "desc", TaskPriority.HIGH);
		
		assertEquals("name", result.getName());
		assertEquals("desc", result.getDescription());
		assertEquals(TaskPriority.HIGH, result.getPriority());
		assertNotNull(result.getSubTasks());
	}

}
