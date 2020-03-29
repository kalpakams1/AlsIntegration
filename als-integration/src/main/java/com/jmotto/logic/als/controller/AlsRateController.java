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
import com.jmotto.logic.als.service.AlsRateService;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsRateController {

	static Logger log = Logger.getLogger(AlsRateController.class.getName());
	
	@Autowired
	AlsRateService service;
	
	/**
	 * The als_get_ rates_additional.cgi http interface will retrieve additional product rate information needed for the product.
	 * @param productrate
	 * @return
	 */
	@GetMapping(value = "/ratesadditional", produces = "application/json")
	public ResponseEntity<?> findRateAdditional(@RequestParam(required = false) Integer productrate) throws JmottoAlsException
	{

		log.debug("Parameters: Productrate:" + productrate );		
		
		return service.getRateAdditional(productrate);
	}

	/**
	 * The get_rates web service will retrieve all Product Rates  and information  about those products i.e.
	 * ( Vendor, Category, Location ) available to in your system based on if the product  and that are active and web enabled.
     * Pricing is date sensitive in AL-Desk, which allows new pricing to have a Date of Booking and Date of Activity.
     * For convenience, The als_get_rates.cgi supports a date Param (default to today) that sets both Booking and Activity date.
     * bookingdate and activitydate are also supported. Returned rates include only those for active Products that are tagged for 
     * webportal use and also have the rate itself available for use on the web portal returned.
	 * @param location, category, vendor, product, bookingdate, activitydate, date, productinfo, content, wholesale	
	 * @return
	 */
	@GetMapping(value = "/rates", produces = "application/json")
	public ResponseEntity<?> findCategories(@RequestParam(required = false) Integer location, 
			@RequestParam(required = false) Integer category, @RequestParam(required = false) Integer vendor,
			@RequestParam(required = false) Integer product, @RequestParam(required = false) String bookingdate,
			@RequestParam(required = false) String activitydate,@RequestParam(required = false) String date,
			@RequestParam(required = false) Boolean productinfo,@RequestParam(required = false) Boolean content,
			@RequestParam(required = false) Boolean wholesale) throws JmottoAlsException
	{

		log.debug("Parameters: location:" + location + "\t vendor:" + vendor 
				+ "\t category:" +category+ "\t bookingdate:" +bookingdate
				+ "\t date:" +date+ "\t productinfo:" +productinfo
				+ "\t content:" +content+ "\t wholesale:" +wholesale
				+ "\t product:" +product+ "\t activitydate:" +activitydate);		
		
		return service.getRates(location, category, vendor, product, 
				bookingdate, activitydate, date, productinfo, content, wholesale);
	}
	
}
