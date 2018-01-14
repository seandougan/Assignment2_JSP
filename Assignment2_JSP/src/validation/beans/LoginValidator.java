package validation.beans;

import java.util.regex.Pattern;

public class LoginValidator {
	
public boolean loginUNamePassword(String password) {
	
		System.out.println(password);
		
		if(Pattern.matches("[a-zA-Z]+", password)) {	
			
			return true;
		}
		
		return false;
	}

}
