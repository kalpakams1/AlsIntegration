package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.service.AlsHotelService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsHotelController {

	@Autowired
	AlsHotelService service;
	
	/**
	 * This method will fetch all the hotels from ALS and return the result in JSON format.
	 * if the request is made with a location parameter the will return hotels for that location,
	 * else will return results for all location.
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/gethotels", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findHotels(@RequestParam(required = false) String location)
	{
		return service.findHotels(location);
	}

	
}
