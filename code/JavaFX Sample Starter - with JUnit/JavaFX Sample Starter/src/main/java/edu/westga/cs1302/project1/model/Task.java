package edu.westga.cs1302.project1.model;

/**
 * Creates and stores the info of a new task
 * 
 * @author Aiden Webb
 * @version Fall 2025
 */
public class Task {
	
	private final String taskName;
	private String taskDescription;
	private final int taskPriority;
	
	/**
	 * Create a new task
	 * 
	 * @precondition name != null && name.isBlank() = false
	 * @precondition description != null &&  description.isBlank() = false
	 * @precondition 1 <= priority <= 3
	 * 
	 * @param name the name of the task
	 * @param description the description of the details of the task
	 * @param priority the level of importance the task holds, with 3 being the highest priority 
	 */
	public Task(String name, String description, int priority) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be blank or null.");
		}
		
		if (description == null || description.isBlank()) {
			throw new IllegalArgumentException("Description cannot be blank or null");
		}
		
		if (1 > priority || priority > 3) {
			throw new IllegalArgumentException("Priority level must be between 1 and 3");
		}
		
		this.taskName = name;
		this.taskDescription = description;
		this.taskPriority = priority;
	}
	
	/**
	 * Returns the name of the task as a String
	 * 
	 * @return the String itself
	 */
	public String toString() {
		return this.taskName;
	}
	
	/**
	 * Returns the name of the task
	 * 
	 * @return the task's name
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * Returns the description of the task
	 * 
	 * @return the task's description
	 */
	public String getTaskDescription() {
		return this.taskDescription;
	}
	
	/**
	 * Returns the priority level of the task
	 * 
	 * @return the task's priority level
	 */
	public int getTaskPriority() {
		return this.taskPriority;
	}
}
