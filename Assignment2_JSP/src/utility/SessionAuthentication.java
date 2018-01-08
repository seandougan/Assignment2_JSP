package utility;

import javax.servlet.http.HttpSession;

public class SessionAuthentication {

	public SessionAuthentication() {}
	
	public static Boolean authenticateSession(HttpSession ss) {
		
		if(ss.getAttribute("verified")== null || !ss.getAttribute("verified").equals("loggedIn")){
			
			return true;
		}
		else
			return false;
	}
}
