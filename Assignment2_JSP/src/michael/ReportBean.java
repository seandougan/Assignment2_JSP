package michael;

import java.io.Serializable;


import utility.Database;

public class ReportBean implements Serializable {
	

	private String name;
	private String date;
	
	// Section is the template name
	private String comment1;
	private String comment2;
	private String comment3;
	private String templ_ID_FK;
	
	
	private int eva11;
	
	private int eva12;
	
	private int eva13;
	
	private int eva14;
	
	private int eva15;
	
	
	
	private int eva21;
	
	private int eva22;
	
	private int eva23;
	
	

	private int eva31;
	
	private int eva32;
	
	private int eva33;
	
public ReportBean() {
		
	}
	
	public ReportBean(String name, String date, String comment1, String comment2, String comment3, String templ_ID_FK, int eva11, int eva12, int eva13, int eva14, int eva15, int eva21, int eva22, int eva23, int eva31, int eva32, int eva33) {
		this.name = name;
		this.date = date;
		this.comment1 = comment1;
		this.comment2 = comment2;
		this.comment3 = comment3;
		this.templ_ID_FK = templ_ID_FK;
		
		this.eva11 = eva11;
		this.eva12 = eva12;
		this.eva13 = eva13;
		this.eva14 = eva14;
		this.eva15 = eva15;
		
		this.eva21 = eva21;
		this.eva22 = eva22;
		this.eva23 = eva23;
		
		this.eva31 = eva31;
		this.eva32 = eva32;
		this.eva33 = eva33;
		
	}

	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public String getComment3() {
		return comment3;
	}

	public void setComment3(String comment3) {
		this.comment3 = comment3;
	}

	public String getTempl_ID_FK() {
		return templ_ID_FK;
	}

	public void setTempl_ID_FK(String templ_ID_FK) {
		this.templ_ID_FK = templ_ID_FK;
	}

	public int getEva11() {
		return eva11;
	}

	public void setEva11(int eva11) {
		this.eva11 = eva11;
	}

	public int getEva12() {
		return eva12;
	}

	public void setEva12(int eva12) {
		this.eva12 = eva12;
	}

	public int getEva13() {
		return eva13;
	}

	public void setEva13(int eva13) {
		this.eva13 = eva13;
	}

	public int getEva14() {
		return eva14;
	}

	public void setEva14(int eva14) {
		this.eva14 = eva14;
	}

	public int getEva15() {
		return eva15;
	}

	public void setEva15(int eva15) {
		this.eva15 = eva15;
	}

	public int getEva21() {
		return eva21;
	}

	public void setEva21(int eva21) {
		this.eva21 = eva21;
	}

	public int getEva22() {
		return eva22;
	}

	public void setEva22(int eva22) {
		this.eva22 = eva22;
	}

	public int getEva23() {
		return eva23;
	}

	public void setEva23(int eva23) {
		this.eva23 = eva23;
	}

	public int getEva31() {
		return eva31;
	}

	public void setEva31(int eva31) {
		this.eva31 = eva31;
	}

	public int getEva32() {
		return eva32;
	}

	public void setEva32(int eva32) {
		this.eva32 = eva32;
	}

	public int getEva33() {
		return eva33;
	}

	public void setEva33(int eva33) {
		this.eva33 = eva33;
	}


}
