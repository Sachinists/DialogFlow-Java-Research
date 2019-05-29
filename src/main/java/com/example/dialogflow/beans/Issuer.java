package com.example.dialogflow.beans;

public class Issuer {

	private String name;
	private String dob;
	private String address;
	private long mobileNumber;
	
	public Issuer(String name, String dob, String address, long mobileNumber) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
