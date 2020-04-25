package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.service.AlsCompanyService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsCompanyController {

	@Autowired
	AlsCompanyService service;
	
	/**
	 * The als_get_company_info.cgi interface will retrieve company information.
	 * @param content
	 * @return
	 */
	@GetMapping(value = "/companyinfo", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getCompanyDetails(@RequestParam(required = false) boolean content) throws JmottoAlsException
	{

		return service.getCompanyDetails(content);
	}
}
