package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.boot.SpringApplication;

import com.example.demo.AppointmentsApplication;

@Entity
@Table(name = "AVAILABILIY")
public class Availability {

	@Column
	@Id
	@SequenceGenerator(name = "availability_sequence", sequenceName = "availability_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "availability_sequence")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "provider_id", nullable = false)
	private Provider provider;
	@Column(nullable = false)
	private LocalDateTime startTime;
	@Column(nullable = false)
	private LocalDateTime endTime;

	public Availability() {

	}

	public Availability(Provider provider, LocalDateTime startTime, LocalDateTime endTime) {
		this.provider = provider;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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

	public static void main(String[] args) {
		SpringApplication.run(AppointmentsApplication.class, args);
	}

}
