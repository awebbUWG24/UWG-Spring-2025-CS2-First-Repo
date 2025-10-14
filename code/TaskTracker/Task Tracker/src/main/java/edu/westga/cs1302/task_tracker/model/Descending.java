package edu.westga.cs1302.task_tracker.model;

import java.util.Comparator;

import edu.westga.cs1302.task_tracker.model.Task.TaskPriority;

/** Compares tasks based on the highest priority being first.
 *
 * @author AidenWebb
 * @version Fall 2025
 */
public class Descending implements Comparator<Task> {

	@Override
	public int compare(Task taskA, Task taskB) {
		if (taskA == null || taskB == null) {
			throw new IllegalArgumentException("Tasks cannot be null");
		}
		
		int orderValue = 0;
		TaskPriority taskAPriority = taskA.getPriority();
		TaskPriority taskBPriority = taskB.getPriority();
		
		if (taskAPriority.getTaskLevelNumber() > taskBPriority.getTaskLevelNumber()) {
			orderValue = -1;
		}
		if (taskAPriority.getTaskLevelNumber() < taskBPriority.getTaskLevelNumber()) {
			orderValue = 1;
		}
		
		return orderValue;
	}

}
