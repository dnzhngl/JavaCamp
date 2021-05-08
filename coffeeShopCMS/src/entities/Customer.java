package entities;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private long nationalId;
	private String firstname;
	private String lastname;
	private LocalDate dob;
	
	public Customer(int id, long nationalId, String firstname, String lastname, LocalDate dob) {
		this.id = id;
		this.nationalId = nationalId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNationalId() {
		return nationalId;
	}
	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
