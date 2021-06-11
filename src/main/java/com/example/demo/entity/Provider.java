package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROVIDER")
public class Provider {

	@Column
	@Id
	private String id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@ManyToOne
	@JoinColumn(name = "clinic_id", nullable = false)
	private Clinic clinic;

	public Provider() {

	}

	public Provider(String firstName, String lastName,Clinic clinic) {
		this.id = firstName + lastName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.clinic = clinic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
}
