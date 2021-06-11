package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "APPOINTMENT")
public class Appointment {

	@Column
	@Id
	@SequenceGenerator(name = "appointment_sequence", sequenceName = "appointment_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_sequence")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "provider_id", nullable = false)
	private Provider provider;
	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	@Column(nullable = false)
	private LocalDateTime startTime;
	@Column(nullable = false)
	private LocalDateTime endTime;

	public Appointment() {

	}

	public Appointment(Provider provider, Patient patient, LocalDateTime startTime, LocalDateTime endTime) {
		this.provider = provider;
		this.patient = patient;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

}
