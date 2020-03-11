package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.service.AlsHotelService;

@RestController
@RequestMapping("/api/als")
@CrossOrigin
public class AlsCategoryController {

	static Logger log = Logger.getLogger(AlsCategoryController.class.getName());
	
	@Autowired
	AlsHotelService service;
	
	/**
	 * This method will fetch all the hotels from ALS and return the result in JSON format.
	 * if the request is made with a location parameter the will return hotels for that location,
	 * else will return results for all location.
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/categories", produces = "application/json")
	public ResponseEntity<?> findHotels(@RequestParam(required = false) String location)
	{

		log.debug("Parameters: " + location);		
		
		return service.findHotels(location);
	}

	
}
