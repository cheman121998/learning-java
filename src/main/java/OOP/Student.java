package OOP;

import java.util.Calendar;

public class Student {
	public void learn() {
		System.out.println("Man Man is learning OOP");
	}
	public String name;
	public String code;
	public int year;
	
	//SETTER
	public void setName(String vName) {
		this.name = vName;
	}
	public void setCode(String vCode) {
		this.code = vCode;
	}
	public void setYear(int vYear) {
		this.year = vYear;
	}
	
	//GETTER
	
	public String getName() {
		return this.name;
	}
	public String getCode() {
		return this.code;
	}
	public int getYear() {
		return this.year; 
	}
	
	
	
	//Phuong thuc showInfo chu yeu la de tra ra gia tri nen kieu du lieu se la void
	public void showInfo() {
		System.out.println("Student's name: " + this.getName());
		System.out.println("Student's code: " + this.getCode());
		System.out.println("Student's year: " + this.getYear());
	}
		
	//Phuong thuc getAge, de lay tuoi, vi vay co kieu tra ve giong voi kieu du lieu cua age (int)
	public int getAge() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.year;
	}
	
}
