package com.jmotto.logic.als.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.AlsSearchCommonParameters;
import com.jmotto.logic.als.service.AlsRateService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsRateController {

	@Autowired
	AlsRateService service;
	
	/**
	 * The als_get_ rates_additional.cgi http interface will retrieve additional product rate information needed for the product.
	 * @param productrate
	 * @return
	 */
	@GetMapping(value = "/ratesadditional", produces = "application/json")
	@LogThat
	public ResponseEntity<?> findRateAdditional(@RequestParam(required = false) Integer productrate) throws JmottoAlsException
	{

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
	@LogThat
	public ResponseEntity<?> findCategories(@RequestBody(required = false) AlsSearchCommonParameters searchParams) throws JmottoAlsException
	{
		if(null == searchParams) {
			searchParams = new AlsSearchCommonParameters();
		}
		return service.getRates(searchParams.getLocation(), searchParams.getCategory(), searchParams.getVendor(), searchParams.getProduct(), 
				searchParams.getBookingdate(), searchParams.getActivitydate(), searchParams.getDate(), searchParams.isProductinfo()
				, searchParams.getContent(), searchParams.isWholesale());
	}
	
}
