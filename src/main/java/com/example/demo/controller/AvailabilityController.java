package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Availability;
import com.example.demo.service.AvailabilityService;

@RestController
@RequestMapping(path = "api/v1/availabilites")
public class AvailabilityController {

	@Autowired
	private final AvailabilityService availabilityService;

	public AvailabilityController(AvailabilityService availabilityService) {

		this.availabilityService = availabilityService;
	}

	@GetMapping
	public List<Availability> getAvailabilities() {
		return this.availabilityService.getAvailabilities();

	}

	@GetMapping("/")
	public Availability getAvailabilityById(@RequestParam() Long availabilityId) {
		return this.availabilityService.getAvailabilityById(availabilityId);

	}

	@GetMapping("/getByDates")
	public List<Availability> getAvailabilityByDates(@RequestParam() String providerId,
			@RequestParam() String startDate, @RequestParam() String endDate) {
		
		return this.availabilityService.getAvailabilityByDates(providerId, startDate, endDate);

	}

}
