package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping(path = "api/v1/patients")
public class PatientController {

	@Autowired
	private final PatientService patientService;

	public PatientController(PatientService patientService) {

		this.patientService = patientService;
	}

	@GetMapping
	public List<Patient> getPatients() {
		return this.patientService.getPatients();

	}
}
