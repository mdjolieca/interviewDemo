package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping(path = "api/v1/appointments")
public class AppointmentController {

	@Autowired
	private final AppointmentService appointmentService;

	public AppointmentController(AppointmentService appointmentService) {

		this.appointmentService = appointmentService;
	}

	@GetMapping
	public List<Appointment> getAppointments() {
		return this.appointmentService.getAppointments();

	}

	@GetMapping("/bookAppointment")
	public Appointment bookAppoinment(@RequestParam() Long availabilityId, @RequestParam() String patientId) {

		return this.appointmentService.bookAppointment(availabilityId, patientId);

	}
}
