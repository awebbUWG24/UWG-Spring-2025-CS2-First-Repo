package edu.westga.cs1302.lab5.persistence.student_data_persistence_manager;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import edu.westga.cs1302.lab5.model.Student;
import edu.westga.cs1302.lab5.persistence.StudentDataPersistenceManager;

class TestSaveStudentData {

	@Test
	void testWhenSaveStudentDataRecievesNormalInput() throws IOException {
		File testFile = new File(StudentDataPersistenceManager.FILE_LOCATION);
		
		Student student1 = new Student("Jonah", 87);
		Student student2 = new Student("Jamie", 93);
		Student[] listOfStudents = {student1, student2};
		
		StudentDataPersistenceManager.saveStudentData(listOfStudents);

        try (Scanner scanner = new Scanner(testFile)) {
            assertTrue(scanner.hasNextLine());
            assertEquals("Jonah,87", scanner.nextLine());

            assertTrue(scanner.hasNextLine());
            assertEquals("Jamie,93", scanner.nextLine());

            assertFalse(scanner.hasNextLine());
        }
	}
	
	@Test
	void testSaveStudentWhenFileIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			StudentDataPersistenceManager.saveStudentData(null);
		});
	}
			
}
