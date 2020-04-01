package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	/**
	 * The als_insert_client.cgi interface inserts a new client into the AL-Desk Client table. The primary key of the Client table is an Integer field named Code. 
	 * Upon successful insertion the new data is returned as XML including the unique identifier for the new client.
	 * That identifier can be used to update the client row using the als_update_client.cgi method.
	 * @param location
	 * @return
	 */
	@PutMapping(value = "/insertclient", produces = "application/json")
	public ResponseEntity<?> insertClient(@RequestParam(required = false) Integer webusercode, 
			@RequestParam(required = false) String email,@RequestParam(required = false) String lastname,
			@RequestParam(required = false) String arrivaldate,@RequestParam(required = false) String departuredate,
			@RequestParam(required = false) Integer cellphone,@RequestParam(required = false) Integer faxphone,
			@RequestParam(required = false) Integer homephone) throws JmottoAlsException
	{

		log.debug("Parameters: webusercode:" + webusercode + "\t email:" + email + "\t lastname:" + lastname
				+ "\t arrivaldate:" +arrivaldate+ "\t departuredate:" +departuredate+ "\t cellphone:" +cellphone
				+ "\t faxphone:" +faxphone+ "\t homephone:" +homephone);		
		
		return service.insertClient(webusercode, lastname, email, arrivaldate, departuredate, cellphone, faxphone, homephone);
	}
}
