package edu.westga.cs1302.task_tracker.model;

import java.util.Comparator;

/** Compares two tasks based on alphabetical ordering, from Z to A
 *  
 * @author AidenWebb
 * @version Fall 2025
 */
public class NameDescending implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		if (o1 == null) {
			throw new IllegalArgumentException("o1 must not be null");
		}
		if (o2 == null) {
			throw new IllegalArgumentException("o2 must not be null");
		}
		
		int result = 1;
		
		if (o1.getName().equals(o2.getName())) {
			result = 0;
		} else if (o1.getName().compareTo(o2.getName()) > 0) {
			result = -1;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Descending (Alphabetical)";
	}

}
