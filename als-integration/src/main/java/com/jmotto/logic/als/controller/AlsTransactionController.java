package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.service.AlsTransactionService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsTransactionController {

	@Autowired
	AlsTransactionService service;
	
	/**
	 * The als_get_transaction_types.cgi interface all retrieve all transaction types used on vouchers
	 * @return
	 */
	@GetMapping(value = "/transactions", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findTransactions()
	{
		return service.findTransactions();
	}
}
