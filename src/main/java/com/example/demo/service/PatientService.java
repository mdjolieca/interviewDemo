 package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {


	private final PatientRepository patientRepository;
	
	
	@Autowired
	public PatientService(PatientRepository patientRepository) {
		
		this.patientRepository = patientRepository;
	}


	public List<Patient> getPatients() {
		  return this.patientRepository.findAll();
		
	  }
	
	
}
