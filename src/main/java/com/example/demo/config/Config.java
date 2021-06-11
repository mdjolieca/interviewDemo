package com.example.demo.config;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Availability;
import com.example.demo.entity.Clinic;
import com.example.demo.entity.Patient;
import com.example.demo.entity.Provider;
import com.example.demo.repository.AvailabilityRepository;
import com.example.demo.repository.ClinicRepository;
import com.example.demo.repository.PatientRepository;
import com.example.demo.repository.ProviderRepository;

@Configuration
public class Config {

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository,
			AvailabilityRepository availabilityRepository, ProviderRepository providerRepository,ClinicRepository clinicRepositoryd) {

		return args -> {
			
			//Demo Data for testing
			Clinic clinic = new Clinic("Demo Clinic");
			clinicRepositoryd.save(clinic);
			Patient patient = new Patient("Josee", "Caron",clinic);
			Patient patient1 = new Patient("John", "Smith",clinic);
			patientRepository.saveAll(List.of(patient, patient1));

			Provider provider = new Provider("Charles", "Darwin",clinic);
			Provider provider1 = new Provider("Marie", "Brown",clinic);
			providerRepository.saveAll(List.of(provider, provider1));

			Availability availability = new Availability(provider, LocalDateTime.parse("2022-01-01T15:00"),
					LocalDateTime.parse("2022-01-01T15:15"));
			Availability availability1 = new Availability(provider, LocalDateTime.parse("2022-01-01T15:15"),
					LocalDateTime.parse("2022-01-01T15:30"));
			Availability availability2 = new Availability(provider1, LocalDateTime.parse("2022-02-02T15:00"),
					LocalDateTime.parse("2022-02-02T15:15"));
			Availability availability3 = new Availability(provider1, LocalDateTime.parse("2022-02-02T15:15"),
					LocalDateTime.parse("2022-02-02T15:30"));
			availabilityRepository.saveAll(List.of(availability, availability1, availability2, availability3));

		};
	}

}
