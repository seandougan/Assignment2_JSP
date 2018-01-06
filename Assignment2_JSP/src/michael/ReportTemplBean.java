package michael;

import java.io.Serializable;

public class ReportTemplBean implements Serializable {
	
	
	private String name;
	private String department;
	private String date;
	private String section;
	private String crit1;
	private int max1;
	private String crit2;
	private int max2;
	private String crit3;
	private int max3;
	private String crit4;
	private int max4;
	private String crit5;
	private int max5;
	
	public ReportTemplBean(String name, String department, String date, String section, String crit1, int max1, String crit2, int max2, String crit3, int max3, String crit4, int max4, String crit5, int max5) {
		
		this.name = name;
		this.department = department;
		this.date = date;
		this.section = section;
		this.crit1 = crit1;
		this.max1 = max1;
		this.crit2 = crit2;
		this.max2 = max2;
		this.crit3 = crit3;
		this.max3 = max3;
		this.crit4 = crit4;
		this.max4 = max4;
		this.crit5 = crit5;
		this.max5 = max5;
		
	}

}
