package validation.beans;

/*
 ** Project: < Comp3095 Assignment1 … >
* Assignment: < 1>
* Author(s): < Sean Dougan, Gregory Uchitel, Michael Van Dyke, James Massel, Matthew McCarthy>
* Student Number: RESPECTIVELY: 101029633, 100322200, 101008864, 101025072, 101009842 >
* Date: Friday December 8th, 7:13PM COMPLETION TIME
* Description: <Comments are dispursed all over the project, I apologize but have to move on with other assignments
* It is sloppy but functional, thank you for the extra time learned a lot> 
 */

import java.lang.Exception;

public class EmployeeValidation {
	
	private static final String EMAIL_PATTERN = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
	private static final String ALPHABET_PATTERN = "[a-zA-Z]+";
	private static final String NUMBER_PATTERN = "^[0-9]+$";
	
	public boolean ValidateEmail(String email) {
		//Returns true if email is valid
		if (email == null || email.isEmpty() || !email.matches(EMAIL_PATTERN)){
			return false;
		}
		return true;
	}
	
	public boolean ValidateNumber(String number){
		if (number == null || number.isEmpty() || !number.matches(NUMBER_PATTERN)){
			return false;
		}
		return true;
	}
	
	public boolean ValidateName(String name) {
		//Returns true if string is only characters
		if (name == null || name.isEmpty() || !name.matches(ALPHABET_PATTERN)){
			return false;
		}
		return true;
	}
	
	public boolean ValidateValue(String value){
		//returns true if the value is not empty
		if (value == null || value.isEmpty()){
			return false;
		}
		return true;
	}

}
