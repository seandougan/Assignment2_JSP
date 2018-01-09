/*
 * FINDS AND RETURNS VALUES OF COOKIES
 */
package utility;

import javax.servlet.http.Cookie;

public class CookieFinder {


	String name = null;//string holds cookie value

	//COOKIE ACCESED THROUGH SERVLET PARAMETERS DEPENDS TO BE USED BY A SERVLET
	public String findCookie(Cookie[] cookies) {
		
		try {

			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("comp3095UserName")) {
					
					setName(cookie.getValue());
					System.out.println("Cookie found!");
					break;
				}
			}
	
			return this.name;
	}
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("No cookies found!");
		
			return this.name;
		}
	}
 
	private void setName(String name) {
		
		this.name = name;
	}
	
	
}
