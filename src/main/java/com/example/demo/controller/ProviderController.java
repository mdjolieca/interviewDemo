package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Provider;
import com.example.demo.service.ProviderService;

@RestController
@RequestMapping(path = "api/v1/providers")
public class ProviderController {

	@Autowired
	private final ProviderService providerService;

	public ProviderController(ProviderService providerService) {

		this.providerService = providerService;
	}

	@GetMapping
	public List<Provider> getProviders() {
		return this.providerService.getProviders();

	}
	
	@GetMapping("/")
	public Provider getProviderById(@RequestParam()String id) {
		return this.providerService.getProviderById(id);

	}
	
	@GetMapping("/getByFirstName")
	public List<Provider> getByFirstName(@RequestParam()String name) {
		return this.providerService.getProviderByfirstName(name);

	}
	
	@GetMapping("/getByLastName")
	public List<Provider> getByLastName(@RequestParam()String name) {
		return this.providerService.getProviderByLastName(name);

	}
	
}
