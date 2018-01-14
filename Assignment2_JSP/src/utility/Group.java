package utility;

import java.util.ArrayList;
import java.util.List;

public class Group {
	String groupName;
	String groupDepartment;
	String employee1;
	String employee2;
	String employee3;
	String employee4;
	String employee5;
	String employee6;
	String employeeNum1;
	String employeeNum2;
	String employeeNum3;
	String employeeNum4;
	String employeeNum5;
	String employeeNum6;
	
	
	public Group () {}
	
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDepartment() {
		return groupDepartment;
	}

	public void setGroupDepartment(String groupDept) {
		this.groupDepartment = groupDept;
	}
	public String getGroupEmployee1() {
	
		return employee1;
	}
	public String getGroupEmployee2() {
		
		return employee2;
	}
	public String getGroupEmployee3() {
			
		return employee3;
	}
	public String getGroupEmployee4() {
		
		return employee4;
	}
	public String getGroupEmployee5() {
		
		return employee5;
	}
	public String getGroupEmployee6() {
		
		return employee5;
	}
	public void setGroupEmployee(String employee1, String employee2, String employee3, String employee4, String employee5, String employee6) {
		this.employee1 = employee1;
		this.employee2 = employee2;
		this.employee3 = employee3;
		this.employee4 = employee4;
		this.employee5 = employee5;
		this.employee6 = employee6;
	}
	public String getGroupEmployeeNum1() {
		
		return employeeNum1;
	}
	public String getGroupEmployeeNum2() {
		
		return employeeNum2;
	}
	public String getGroupEmployeeNum3() {
	
		return employeeNum3;
	}
	public String getGroupEmployeeNum4() {
		return employeeNum4;
	}
	public String getGroupEmployeeNum5() {

		return employeeNum5;
	}
	public String getGroupEmployeeNum6() {

		return employeeNum6;
	}
	public void setGroupEmployeeNum(String employeeNum1, String employeeNum2, String employeeNum3, String employeeNum4, String employeeNum5) {
		this.employeeNum1 = employeeNum1;
		this.employeeNum2 = employeeNum2;
		this.employeeNum3 = employeeNum3;
		this.employeeNum4 = employeeNum4;
		this.employeeNum5 = employeeNum5;
	}
}
