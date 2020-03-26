package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.service.AlsClientService;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsClientController {

	static Logger log = Logger.getLogger(AlsClientController.class.getName());
	
	@Autowired
	AlsClientService service;
	
	/**
	 * This method will fetch all the hotels from ALS and return the result in JSON format.
	 * if the request is made with a location parameter the will return hotels for that location,
	 * else will return results for all location.
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/getclient", produces = "application/json")
	public ResponseEntity<?> findClients(@RequestParam(required = false) String client, 
			@RequestParam(required = false) String email, @RequestParam(required = false, defaultValue = "false") Boolean ccinfocheck) throws JmottoAlsException
	{

		log.debug("Parameters: client:" + client + "\t email:" + email + "\t ccinfocheck:" +ccinfocheck);		
		
		return service.findClients(client, email, ccinfocheck);
	}

	
}
