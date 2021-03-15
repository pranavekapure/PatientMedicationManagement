package com.management.dto;

import java.util.List;

import com.management.pojo.Medicine;
import com.management.pojo.Patient;

public class PatientInfoDto {

	private Patient patient;
	private List<Medicine> listOfMedicine;
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public List<Medicine> getListOfMedicine() {
		return listOfMedicine;
	}
	public void setListOfMedicine(List<Medicine> listOfMedicine) {
		this.listOfMedicine = listOfMedicine;
	}
	
	 
}
