package com.management.pojo;

public class Patient {

	private Integer patientId;

	private String firstName;

	private String lastName;

	private String dob;

	private String country;

	private String gender;

	private String treatmentLocation;

	public Patient() {
		super();
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTreatmentLocation() {
		return treatmentLocation;
	}

	public void setTreatmentLocation(String treatmentLocation) {
		this.treatmentLocation = treatmentLocation;
	}

}
