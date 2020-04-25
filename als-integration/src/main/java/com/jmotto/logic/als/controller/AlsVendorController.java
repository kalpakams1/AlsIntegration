package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.AlsSearchCommonParameters;
import com.jmotto.logic.als.service.AlsVendorService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsVendorController {

	static Logger log = Logger.getLogger(AlsVendorController.class.getName());
	
	@Autowired
	AlsVendorService service;
	
	/**
	 * The als_get_vendors.cgi web service will retrieve all vendors available to in your system based on products that are active and web enabled.,
	 *  and the associated AL-Desk code for the Vendors.
	 * @param AlsSearchCommonParameters	
	 * @return Vendors
	 */
	@GetMapping(value = "/getvendors", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getVendors(@RequestBody(required = false) AlsSearchCommonParameters searchParams) throws JmottoAlsException {

		if(null == searchParams) {
			searchParams = new AlsSearchCommonParameters();
		}
		return service.getVendors(searchParams);
	}
}
