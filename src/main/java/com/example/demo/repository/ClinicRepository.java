package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, String> {
	
	

}
