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
import com.jmotto.logic.als.service.AlspricingService;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsProductPricingController {

	static Logger log = Logger.getLogger(AlsProductPricingController.class.getName());
	
	@Autowired
	AlspricingService service;
	
	/**
	 * The als_get_product_pricing.cgi  web service will retrieve Product Pricing information.
	 * Product Rate information requires base pricing information in order to calculate re-sale rates
	 * @param product, vendor, productRate	
	 * @return Pricing
	 */
	@GetMapping(value = "/pricing", produces = "application/json")
	public ResponseEntity<?> findCategories(@RequestParam(required = false) Integer product, 
			@RequestParam(required = false) Integer vendor, @RequestParam(required = false) Integer productRate) 
					throws JmottoAlsException
	{

		log.debug("Parameters: product:" + product + "\t vendor:" +vendor+ "\t productRate:" +productRate);		
		
		return service.getProductPricing(product, vendor, productRate);
	}
	
}
