package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.service.AlsLocationService;

@RestController
@RequestMapping("/api/als")
@CrossOrigin
public class AlsLocationController {

	static Logger log = Logger.getLogger(AlsLocationController.class.getName());
	
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
	public ResponseEntity<?> findLocations()
	{
		return service.findLocations();
	}

	
}
