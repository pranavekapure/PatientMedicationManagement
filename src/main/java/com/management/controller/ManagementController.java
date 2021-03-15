package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.PatientInfoDto;
import com.management.service.IManagementService;

@RestController
@RequestMapping("/management")
public class ManagementController {
	
	@Autowired
	private IManagementService managementService;

	@RequestMapping(path = "getPatient/{patientId}",method = RequestMethod.GET)
	public PatientInfoDto getPatientInfo(@PathVariable Integer patientId) {
		return managementService.getPatientInfo(patientId);
	}

}
