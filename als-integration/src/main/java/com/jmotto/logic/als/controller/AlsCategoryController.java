package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.service.AlsCategoryService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsCategoryController {

	@Autowired
	AlsCategoryService service;
	
	/**
	 * The als_get_categories.cgi interface all retrieve all categories available to in your system based on products that 
	 * are active and web enabled. i.e (Helicopter, Scuba Diving, Luau ), and the associated AL-Desk code for the category.
	 * Optionally you can limit the results to a specific Location by using a location input parameter.
	 * @param location
	 * @return
	 */
	@GetMapping(value = "/categories", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findCategories(@RequestParam(required = false) Integer location, 
			@RequestParam(required = false) Integer categoryGroup, @RequestParam(required = false) boolean includeDesc,
			@RequestParam(required = false) boolean imageurl) throws JmottoAlsException
	{

		return service.findCategories(location, categoryGroup, includeDesc, imageurl);
	}

	
}
