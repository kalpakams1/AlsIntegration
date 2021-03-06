package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.Client;
import com.jmotto.logic.als.service.AlsClientService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsClientController {

	@Autowired
	AlsClientService service;

	/**
	 * This method will fetch all the hotels from ALS and return the result in JSON
	 * format. if the request is made with a location parameter the will return
	 * hotels for that location, else will return results for all location.
	 * 
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/getclient", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findClients(@RequestParam(required = false) String client,
			@RequestParam(required = false) String email,
			@RequestParam(required = false, defaultValue = "false") boolean ccinfocheck) throws JmottoAlsException {

		return service.findClients(client, email, ccinfocheck);
	}

	/**
	 * The als_insert_client.cgi interface inserts a new client into the AL-Desk
	 * Client table. The primary key of the Client table is an Integer field named
	 * Code. Upon successful insertion the new data is returned as XML including the
	 * unique identifier for the new client. That identifier can be used to update
	 * the client row using the als_update_client.cgi method.
	 * 
	 * @param Client
	 * @return
	 */
	@PutMapping(value = "/insertclient", produces = "application/json")
	@LogThat
	public ResponseEntity<?> insertClient(@RequestBody(required = true) Client client) throws JmottoAlsException {

		return service.insertClient(client);
	}

	/**
	 * The als_insert_client.cgi interface inserts a new client into the AL-Desk
	 * Client table. The primary key of the Client table is an Integer field named
	 * Code. Upon successful insertion the new data is returned as XML including the
	 * unique identifier for the new client. That identifier can be used to update
	 * the client row using the als_update_client.cgi method.
	 * 
	 * @param location
	 * @return
	 */
	@PutMapping(value = "/updateclient", produces = "application/json")
	@LogThat
	public ResponseEntity<?> updateClient(@RequestBody(required = true) Client client) throws JmottoAlsException {

		return service.updateClient(client);
	}

	/**
	 * The als_insert_client.cgi interface inserts a new client into the AL-Desk
	 * Client table. The primary key of the Client table is an Integer field named
	 * Code. Upon successful insertion the new data is returned as XML including the
	 * unique identifier for the new client. That identifier can be used to update
	 * the client row using the als_update_client.cgi method.
	 * 
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/getclientchanges", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getClientChanges(@RequestParam(required = true) Integer clientNumber)
			throws JmottoAlsException {

		return service.getClientChanges(clientNumber);
	}

	
}
