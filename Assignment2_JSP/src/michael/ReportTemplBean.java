package michael;

import java.io.Serializable;

public class ReportTemplBean implements Serializable {
	
	
	private String name;
	private String department;
	private String date;
	// Section is the template name
	private String section1;
	
	
	private String crit11;
	private int max11;
	private String crit12;
	private int max12;
	private String crit13;
	private int max13;
	private String crit14;
	private int max14;
	private String crit15;
	private int max15;
	
	private String section2;
	private String crit21;
	private int max21;
	private String crit22;
	private int max22;
	private String crit23;
	private int max23;
	
	private String section3;
	private String crit31;
	private int max31;
	private String crit32;
	private int max32;
	private String crit33;
	private int max33;
	
	public ReportTemplBean() {
		
	}
	
	public ReportTemplBean(String name, String department, String date, String section1
			, String section2, String section3, String crit11, int max11, String crit12, int max12, String crit13, int max13, String crit14, int max14, String crit15, int max15, String crit21, int max21, String crit22, int max22, String crit23, int max23, String crit31, int max31, String crit32, int max32, String crit33, int max33) {
		
		
		this.name = name;
		this.department = department;
		this.date = date;
		this.section1 = section1;
		this.section2 = section2;
		this.section3 = section3;
		this.crit11 = crit11;
		this.max11 = max11;
		this.crit12 = crit12;
		this.max12 = max12;
		this.crit13 = crit13;
		this.max13 = max13;
		this.crit14 = crit14;
		this.max14 = max14;
		this.crit15 = crit15;
		this.max15 = max15;
		
		this.crit21 = crit21;
		this.max21 = max21;
		this.crit22 = crit22;
		this.max22 = max22;
		this.crit23 = crit23;
		
		this.crit31 = crit31;
		this.max31 = max31;
		this.crit32 = crit32;
		this.max32 = max32;
		this.crit33 = crit33;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment(String department) {
		
		return department;
		
	}

}
