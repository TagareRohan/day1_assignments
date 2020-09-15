package com.assignment1;

public class Donor {

	
	private int donorID;
	private int donorAge;
	private String donorName;
	private String donorGroup;
	
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donor(int donorID, int donorAge, String donorName, String donorGroup) {
		super();
		this.donorID = donorID;
		this.donorAge = donorAge;
		this.donorName = donorName;
		this.donorGroup = donorGroup;
	}

	public int getDonorID() {
		return donorID;
	}

	public void setDonorID(int donorID) {
		this.donorID = donorID;
	}

	public int getDonorAge() {
		return donorAge;
	}

	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getDonorGroup() {
		return donorGroup;
	}

	public void setDonorGroup(String donorGroup) {
		this.donorGroup = donorGroup;
	}
	
	
	
}
