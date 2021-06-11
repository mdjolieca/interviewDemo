package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Availability;
import com.example.demo.repository.AvailabilityRepository;

@Service
public class AvailabilityService {

	private final AvailabilityRepository availabilityRepository;

	@Autowired
	public AvailabilityService(AvailabilityRepository availabilityRepository) {

		this.availabilityRepository = availabilityRepository;
	}

	public List<Availability> getAvailabilities() {
		return this.availabilityRepository.findAll();

	}

	public Availability getAvailabilityById(Long availabilityId) {

		return this.availabilityRepository.findById(availabilityId).get();
	}

	public List<Availability> getAvailabilityByDates(String providerId, String startDate, String endDate) {

		List<Availability> availabilities = new ArrayList<Availability>();

		this.availabilityRepository.findAll().forEach(availability -> {

			if (availability.getProvider().getId().equals(providerId)) {

				if (dateIsInRange(LocalDateTime.parse(startDate), LocalDateTime.parse(endDate), availability))

					availabilities.add(availability);
			}

		});

		return availabilities;
	}

	private boolean dateIsInRange(LocalDateTime requestStartDate, LocalDateTime requestEndDate,
			Availability availability) {

		LocalDateTime availabilityStartDate = availability.getStartTime();
		LocalDateTime availabilityEndDate = availability.getEndTime();
		System.out.println("aStartDate " + availabilityStartDate);
		System.out.println("aendDate " + availabilityEndDate);

		if (((availabilityStartDate.equals(requestStartDate) || requestStartDate.isBefore(availabilityStartDate))
				&& (availabilityEndDate.equals(requestStartDate) || requestStartDate.isBefore(availabilityEndDate)))
				&& ((availabilityStartDate.equals(requestEndDate) || requestEndDate.isAfter(availabilityStartDate))
						&& (availabilityEndDate.equals(requestEndDate)
								|| requestEndDate.isAfter(availabilityEndDate)))) {

			return true;

		}

		return false;
	}

}
