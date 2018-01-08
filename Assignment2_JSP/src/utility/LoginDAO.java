package utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	

	public  Boolean Login(String usr, String pass){
		System.out.println("Login method called");
		
		try {

			
			//Grabs the connection object and references it to method varaible
			Connection con = Database.startConnection();
            
            //assign our statement variable to the connection string
           Statement stmt = con.createStatement();
            
            //creates sql statement as string
            String sql = "SELECT username, password FROM USERS;";
            
        //stores result set as our statement object, which runs DriverManager.executeQuery and passes in our sql string as the query
            ResultSet rs = stmt.executeQuery(sql);
            
            //parse through results and check
            while(rs.next()) {
            	
            	String user = rs.getString("username");
            	String passwd = rs.getString("password");
            	
            	//compares parameters with what is retrieved from database
                if (passwd.equals(pass) && user.equals(usr)) {
                	
                		con.close();
    	            	return true;
            	}  	
                else {
                	continue;
                }
            }

            con.close();
            return false;
  
        } 	catch (SQLException e) {
        	
        		System.out.println("Error Logging Into Service");
        		e.printStackTrace();
                
                return false;
        	}
	}
}
