package edu.westga.cs1302.task_tracker.model;

import java.util.ArrayList;

/** Stores basic information of a task alongside a list of subtasks
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class ContainerTask extends Task {
	
	private ArrayList<Task> subTaskList;
	
	/** Creates a ContainerTask with the given information
	 * 
	 * @preconditon name != null && !name.isEmpty() &&
	 * 				description != null &&
	 * 				priority != null
	 * 
	 * @param name the name of the task
	 * @param description the description of the task
	 * @param priority the priority level of the task
	 */
	public ContainerTask(String name, String description, TaskPriority priority) {
		super(name, description, priority);
		this.subTaskList = new ArrayList<Task>();
	}
	
	@Override
	public ArrayList<Task> getSubTasks() {
		return this.subTaskList;
	}
	
	@Override
	public ContainerTask addTask(Task taskToAdd) {
		if (taskToAdd == null) {
			throw new IllegalArgumentException("Subtask cannot be null");
		}
		
		this.subTaskList.add(taskToAdd);
		
		return this;
	}
	
	@Override
	public String toString() {
		return this.getName() + " (+)";
	}
}
