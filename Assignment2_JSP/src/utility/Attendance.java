/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Class used to store entries from the database's ATTENDANCE table
 */
package utility;

public class Attendance {
	private int attendId;
	private int empId;
	private boolean present1;
	private boolean present2;
	private boolean present3;
	
	public int getAttendId() {
		return attendId;
	}
	public void setAttendId(int attendId) {
		this.attendId = attendId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public boolean isPresent1() {
		return present1;
	}
	public void setPresent1(boolean present1) {
		this.present1 = present1;
	}
	public boolean isPresent2() {
		return present2;
	}
	public void setPresent2(boolean present2) {
		this.present2 = present2;
	}
	public boolean isPresent3() {
		return present3;
	}
	public void setPresent3(boolean present3) {
		this.present3 = present3;
	}

}
