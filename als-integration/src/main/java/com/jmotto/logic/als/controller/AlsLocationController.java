package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.service.AlsLocationService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsLocationController {

	@Autowired
	AlsLocationService service;
	
	/**
	 * The method will retrieve all locations available to 
	 * in your system based on products that are active and web enabled. 
	 * i.e ( Maui, Oahu, Kauai ), and the associated AL-Desk code for the locations.
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/locations", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findLocations()
	{
		return service.findLocations();
	}

	
}
