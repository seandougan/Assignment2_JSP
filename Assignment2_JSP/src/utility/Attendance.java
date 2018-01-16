/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Class used to store entries from the database's ATTENDANCE table
 */
package utility;

public class Attendance {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String present1;
	private String present2;
	private String present3;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPresent1() {
		return present1;
	}
	public void setPresent1(boolean present1) {
		if (present1) {
			this.present1 = "Present";
		}
		else {
			this.present1 = "Not Present";
		}
	}
	public String getPresent2() {
		return present2;
	}
	public void setPresent2(boolean present2) {
		if (present2) {
			this.present2 = "Present";
		}
		else {
			this.present2 = "Not Present";
		}
	}
	public String getPresent3() {
		return present3;
	}
	public void setPresent3(boolean present3) {
		if (present3) {
			this.present3 = "Present";
		}
		else {
			this.present3 = "Not Present";
		}
	}

}