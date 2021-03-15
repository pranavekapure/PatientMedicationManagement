package com.management.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.management.dto.PatientInfoDto;
import com.management.pojo.MedicineDto;
import com.management.pojo.Patient;
import com.management.service.IManagementService;

@Service
public class ManagementServiceImpl implements IManagementService{
	
	@Autowired
	private RestTemplate restTemplate;

	public PatientInfoDto getPatientInfo(Integer patientId) {
		MedicineDto Medicines=restTemplate.getForObject("http://medication-application/medicine/getMedicineList/"+patientId,MedicineDto.class);
		Patient patient = restTemplate.getForObject("http://patient-application/patient/getPatient/"+patientId, Patient.class);
		PatientInfoDto patientInfoDto=new PatientInfoDto();
		patientInfoDto.setPatient(patient);
		patientInfoDto.setListOfMedicine(Medicines.getListOfMedicine());
		return patientInfoDto;
	}

}
