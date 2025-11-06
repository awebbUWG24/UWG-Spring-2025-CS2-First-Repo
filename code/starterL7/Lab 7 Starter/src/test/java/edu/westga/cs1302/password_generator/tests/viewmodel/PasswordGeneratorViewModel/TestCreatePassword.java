package edu.westga.cs1302.password_generator.tests.viewmodel.PasswordGeneratorViewModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.password_generator.viewmodel.PasswordGeneratorViewModel;

class TestCreatePassword {

	@Test 
	void testMinLength1Only() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(1);
		
		int result = testViewModel.createPassword().length();
		
		assertTrue(result >= 1);
	}
	
	@Test
	void testMinLength3Only() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		
		int result = testViewModel.createPassword().length();
		
		assertTrue(result >= 3);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneUpperCase() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneUpperCaseLetterProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereAnUppercaseLetter = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isUpperCase(currChar)) {
				isThereAnUppercaseLetter = true;
				break;
			}
		}
		
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereAnUppercaseLetter);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneLowerCase() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneLowerCaseLetterProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereALowercaseLetter = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isLowerCase(currChar)) {
				isThereALowercaseLetter = true;
				break;
			}
		}
		
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereALowercaseLetter);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneDigit() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneDigitProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereADigit = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isDigit(currChar)) {
				isThereADigit = true;
				break;
			}
		}
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereADigit);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneUpperAndLowerCase() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneUpperCaseLetterProperty().setValue(true);
		testViewModel.getMustHaveAtLeastOneLowerCaseLetterProperty().setValue(true);;
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereAnUppercaseLetter = false;
		boolean isThereALowercaseLetter = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isLowerCase(currChar)) {
				isThereALowercaseLetter = true;
				break;
			}
		}
		
		for (char currChar : result.toCharArray()) {
			if (Character.isUpperCase(currChar)) {
				isThereAnUppercaseLetter = true;
				break;
			}
		}
		
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereAnUppercaseLetter);
		assertTrue(isThereALowercaseLetter);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneUpperAndOneDigit() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneUpperCaseLetterProperty().setValue(true);
		testViewModel.getMustHaveAtLeastOneDigitProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereAnUppercaseLetter = false;
		boolean isThereADigit = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isDigit(currChar)) {
				isThereADigit = true;
				break;
			}
		}
		
		for (char currChar : result.toCharArray()) {
			if (Character.isUpperCase(currChar)) {
				isThereAnUppercaseLetter = true;
				break;
			}
		}
		
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereAnUppercaseLetter);
		assertTrue(isThereADigit);
	}
	
	@Test
	void testMinLengthThreeAndAtLeastOneLowerAndOneDigit() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneLowerCaseLetterProperty().setValue(true);
		testViewModel.getMustHaveAtLeastOneDigitProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereALowercaseLetter = false;
		boolean isThereADigit = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isDigit(currChar)) {
				isThereADigit = true;
				break;
			}
		}
		
		for (char currChar : result.toCharArray()) {
			if (Character.isLowerCase(currChar)) {
				isThereALowercaseLetter = true;
				break;
			}
		}
		
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereALowercaseLetter);
		assertTrue(isThereADigit);
	}
	
	@Test
	void testMinLengthThreeAndOneUpperOneLowerAndOneDigit() {
		PasswordGeneratorViewModel testViewModel = new PasswordGeneratorViewModel();
		testViewModel.getMinimumLengthProperty().setValue(3);
		testViewModel.getMustHaveAtLeastOneLowerCaseLetterProperty().setValue(true);
		testViewModel.getMustHaveAtLeastOneDigitProperty().setValue(true);
		testViewModel.getMustHaveAtLeastOneUpperCaseLetterProperty().setValue(true);
		
		String result = testViewModel.createPassword();
		int resultLength = result.length();
		boolean isThereALowercaseLetter = false;
		boolean isThereADigit = false;
		boolean isThereAnUppercaseLetter = false;
		
		for (char currChar : result.toCharArray()) {
			if (Character.isDigit(currChar)) {
				isThereADigit = true;
				break;
			}
		}
		
		for (char currChar : result.toCharArray()) {
			if (Character.isLowerCase(currChar)) {
				isThereALowercaseLetter = true;
				break;
			}
		}
		for (char currChar : result.toCharArray()) {
			if (Character.isUpperCase(currChar)) {
				isThereAnUppercaseLetter = true;
				break;
			}
		}
		
		assertTrue(resultLength >= 3);
		assertTrue(isThereALowercaseLetter);
		assertTrue(isThereADigit);
		assertTrue(isThereAnUppercaseLetter);
	}

}
