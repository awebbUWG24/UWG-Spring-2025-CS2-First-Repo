package edu.westga.cs1302.password_generator.viewmodel;

import java.util.Random;

import edu.westga.cs1302.password_generator.model.PasswordGenerator;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;

/** ViewModel for password generator
 * 
 * @author AidenWebb
 * @version Fall 2025
 */
public class PasswordGeneratorViewModel {
	
	private IntegerProperty minimumLengthProperty;
	private BooleanProperty mustHaveAtLeastOneDigitProperty;
	private BooleanProperty mustHaveAtLeastOneUpperCaseLetterProperty;
	private BooleanProperty mustHaveAtLeastOneLowerCaseLetterProperty;
	
	/** 
	 * Initiates a new Password Generator ViewModel
	 */
	public PasswordGeneratorViewModel() {
		this.minimumLengthProperty = new SimpleIntegerProperty();
		this.mustHaveAtLeastOneDigitProperty = new SimpleBooleanProperty();
		this.mustHaveAtLeastOneLowerCaseLetterProperty = new SimpleBooleanProperty();
		this.mustHaveAtLeastOneUpperCaseLetterProperty = new SimpleBooleanProperty();
	}
	
	/** 
	 * Gets the minimum length property
	 * 
	 * @return the minimum length property
	 */
	public IntegerProperty getMinimumLengthProperty() {
		return this.minimumLengthProperty;
	}

	/** 
	 * Gets the must have at least one digit property
	 * 
	 * @return the must have at least one digit property
	 */
	public BooleanProperty getMustHaveAtLeastOneDigitProperty() {
		return this.mustHaveAtLeastOneDigitProperty;
	}

	/** 
	 * Gets the must have at least one upper case letter property
	 * 
	 * @return the must have at least one upper case letter property
	 */
	public BooleanProperty getMustHaveAtLeastOneUpperCaseLetterProperty() {
		return this.mustHaveAtLeastOneUpperCaseLetterProperty;
	}

	/**
	 * Gets the must have at least one lower case letter property
	 * 
	 * @return the must have at least one lower case letter property
	 */
	public BooleanProperty getMustHaveAtLeastOneLowerCaseLetterProperty() {
		return this.mustHaveAtLeastOneLowerCaseLetterProperty;
	}
	
	/**
	 * Generates the password based on the conditions applied
	 * 
	 * @precondition none
	 * @postcondition: the password created will fulfill all the conditions checked off in the window.
	 * 
	 * @return the password generated
	 */
	public String createPassword() {
		
		int minLength = this.minimumLengthProperty.getValue();
		
		Random randomNumberGenerator = new Random();
		PasswordGenerator generator = new PasswordGenerator(randomNumberGenerator.nextLong());
		
		generator.setMinimumLength(minLength);
		generator.setMustHaveAtLeastOneDigit(this.getMustHaveAtLeastOneDigitProperty().getValue());
		generator.setMustHaveAtLeastOneLowerCaseLetter(this.mustHaveAtLeastOneLowerCaseLetterProperty.getValue());
		generator.setMustHaveAtLeastOneUpperCaseLetter(this.mustHaveAtLeastOneUpperCaseLetterProperty.getValue());
		
		return generator.generatePassword();
	}
}
