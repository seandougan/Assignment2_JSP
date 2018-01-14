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
	
	public ReportTemplBean(String name, String department, String date, String section1	, String section2, String section3, String crit11, int max11, String crit12, int max12, String crit13, int max13, String crit14, int max14, String crit15, int max15, String crit21, int max21, String crit22, int max22, String crit23, int max23, String crit31, int max31, String crit32, int max32, String crit33, int max33) {
		
		
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
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSection1() {
		return section1;
	}

	public void setSection1(String section1) {
		this.section1 = section1;
	}

	public String getCrit11() {
		return crit11;
	}

	public void setCrit11(String crit11) {
		this.crit11 = crit11;
	}

	public int getMax11() {
		return max11;
	}

	public void setMax11(int max11) {
		this.max11 = max11;
	}

	public String getCrit12() {
		return crit12;
	}

	public void setCrit12(String crit12) {
		this.crit12 = crit12;
	}

	public int getMax12() {
		return max12;
	}

	public void setMax12(int max12) {
		this.max12 = max12;
	}

	public String getCrit13() {
		return crit13;
	}

	public void setCrit13(String crit13) {
		this.crit13 = crit13;
	}

	public int getMax13() {
		return max13;
	}

	public void setMax13(int max13) {
		this.max13 = max13;
	}

	public String getCrit14() {
		return crit14;
	}

	public void setCrit14(String crit14) {
		this.crit14 = crit14;
	}

	public int getMax14() {
		return max14;
	}

	public void setMax14(int max14) {
		this.max14 = max14;
	}

	public String getCrit15() {
		return crit15;
	}

	public void setCrit15(String crit15) {
		this.crit15 = crit15;
	}

	public int getMax15() {
		return max15;
	}

	public void setMax15(int max15) {
		this.max15 = max15;
	}

	public String getSection2() {
		return section2;
	}

	public void setSection2(String section2) {
		this.section2 = section2;
	}

	public String getCrit21() {
		return crit21;
	}

	public void setCrit21(String crit21) {
		this.crit21 = crit21;
	}

	public int getMax21() {
		return max21;
	}

	public void setMax21(int max21) {
		this.max21 = max21;
	}

	public String getCrit22() {
		return crit22;
	}

	public void setCrit22(String crit22) {
		this.crit22 = crit22;
	}

	public int getMax22() {
		return max22;
	}

	public void setMax22(int max22) {
		this.max22 = max22;
	}

	public String getCrit23() {
		return crit23;
	}

	public void setCrit23(String crit23) {
		this.crit23 = crit23;
	}

	public int getMax23() {
		return max23;
	}

	public void setMax23(int max23) {
		this.max23 = max23;
	}

	public String getSection3() {
		return section3;
	}

	public void setSection3(String section3) {
		this.section3 = section3;
	}

	public String getCrit31() {
		return crit31;
	}

	public void setCrit31(String crit31) {
		this.crit31 = crit31;
	}

	public int getMax31() {
		return max31;
	}

	public void setMax31(int max31) {
		this.max31 = max31;
	}

	public String getCrit32() {
		return crit32;
	}

	public void setCrit32(String crit32) {
		this.crit32 = crit32;
	}

	public int getMax32() {
		return max32;
	}

	public void setMax32(int max32) {
		this.max32 = max32;
	}

	public String getCrit33() {
		return crit33;
	}

	public void setCrit33(String crit33) {
		this.crit33 = crit33;
	}

	public int getMax33() {
		return max33;
	}

	public void setMax33(int max33) {
		this.max33 = max33;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
