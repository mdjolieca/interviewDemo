package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.entity.Availability;
import com.example.demo.entity.Patient;
import com.example.demo.entity.Provider;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.repository.PatientRepository;

@Service
public class AppointmentService {

	private final AppointmentRepository appointmentRepository;
	private final AvailabilityRepository availabilityRepository;
	private final PatientRepository patientRepository;

	@Autowired
	public AppointmentService(AppointmentRepository appointmentRepository, AvailabilityRepository availabilityRepository, PatientRepository patientRepository) {

		this.appointmentRepository = appointmentRepository;
		this.patientRepository = patientRepository;
		this.availabilityRepository = availabilityRepository;
	}

	public List<Appointment> getAppointments() {
		return this.appointmentRepository.findAll();

	}
	
	public Appointment bookAppointment(Long availabilityId, String patientId) {
		
		Availability availability = availabilityRepository.getById(availabilityId);
		Patient patient = patientRepository.getById(patientId);
		
		Appointment appointment = new Appointment( availability.getProvider(),  patient,  availability.getStartTime(), availability.getEndTime());
		
		appointmentRepository.save(appointment);
		availabilityRepository.delete(availability);
				
		return appointment;
	}

}
