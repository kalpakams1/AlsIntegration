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
import com.jmotto.logic.als.service.AlsVoucherService;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsVoucherController {

	static Logger log = Logger.getLogger(AlsVoucherController.class.getName());
	
	@Autowired
	AlsVoucherService service;
	
	/**
	 * Vouchers can be identified by either the primary key (seq) or by using the client:Integer identifier along with the voucher number. 
	 * When editing a voucher with AL-Desk, the Client Identifier along with a voucher number that is unique for that client is used.
	 * @param seq, voucher, client, issued	
	 * @return Vouchers
	 */
	@GetMapping(value = "/vouchers", produces = "application/json")
	public ResponseEntity<?> findCategories(@RequestParam(required = false) Integer seq, 
			@RequestParam(required = false) Integer voucher, @RequestParam(required = false) Integer client,
			@RequestParam(required = false) boolean issued) throws JmottoAlsException
	{

		log.debug("Parameters: seq:" + seq + "\t voucher:" +voucher
				+ "\t client:" +client+ "\t issued:" +issued);		
		
		return service.getVouchers(seq, voucher, client, issued);
	}	
}
