package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Provider;
import com.example.demo.repository.ProviderRepository;

@Service
public class ProviderService {

	private final ProviderRepository providerRepository;

	@Autowired
	public ProviderService(ProviderRepository providerRepository) {

		this.providerRepository = providerRepository;
	}

	public List<Provider> getProviders() {
		return this.providerRepository.findAll();

	}

	public Provider getProviderById(String id) {

		return this.providerRepository.findById(id).get();
	}

	public List<Provider> getProviderByfirstName(String firstName) {

		return this.providerRepository.findByfirstName(firstName);
	}

	public List<Provider> getProviderByLastName(String lastName) {

		return this.providerRepository.findBylastName(lastName);
	}
}
