package in.com.oops;

import java.util.Date;

public class Person {
	
	private int id = 0;
	
	private String name = null;
	
	private String address = null;
	
	private Date dob = null;
	
	public Person() {
		
	}
	
	public Person(int id, String name, Date dob) {
		this.id =id;
		this.name = name;
		this.dob = dob;
	}
	
	public void setld(int id) {
		this.id = id;
	}
	
	public int getld() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Date getDob() {
		return dob;
	}
}
