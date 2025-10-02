package edu.westga.cs1302.lab5.persistence.student_data_persistence_manager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab5.model.Student;
import edu.westga.cs1302.lab5.persistence.StudentDataPersistenceManager;

class TestLoadStudentData {

	@Test
	void testWhenSaveRecievesNormalInput() throws IOException {
		Student student1 = new Student("Jonah", 87);
		Student student2 = new Student("Jamie", 93);
		Student[] listOfStudents = {student1, student2};
		
		StudentDataPersistenceManager.saveStudentData(listOfStudents);
		Student [] resultArray = StudentDataPersistenceManager.loadStudentData();
		
		assertEquals("Jonah", resultArray[0].getName());
		assertEquals("87", resultArray[0].getGrade());
		}
}
