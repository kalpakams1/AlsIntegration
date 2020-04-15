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
import com.jmotto.logic.als.service.AlsPricingProductService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsProductPricingController {

	@Autowired
	AlsPricingProductService service;
	
	/**
	 * The als_get_product_pricing.cgi  web service will retrieve Product Pricing information.
	 * Product Rate information requires base pricing information in order to calculate re-sale rates
	 * @param product, vendor, productRate	
	 * @return Categories
	 */
	@GetMapping(value = "/getproductpricing", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getProductPricing(@RequestParam(required = false) Integer product, 
			@RequestParam(required = false) Integer vendor, @RequestParam(required = false) Integer productRate) 
					throws JmottoAlsException
	{

		return service.getProductPricing(product, vendor, productRate);
	}
	
	/**
	 * The als_get_products.cgi interface will retrieve all Product  and information  about those products i.e.( Vendor, Category, Location )
	 * available to in your system based on if the products that are active and web enabled.
	 * @param location, category, vendor, product, content, nodefaultcontent, 
	 * 			productsearch, descriptionsearch, categorygroup, contentname, inactive
	 * @return Products
	 */
	@GetMapping(value = "/getallproducts", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getAllProducts(@RequestParam(required = false) Integer location, 
			@RequestParam(required = false) Integer category, @RequestParam(required = false) Integer vendor,
			@RequestParam(required = false) Integer product, @RequestParam(required = false) Integer categorygroup
			, @RequestParam(required = false) boolean content, @RequestParam(required = false) boolean nodefaultcontent
			, @RequestParam(required = false) boolean inactive, @RequestParam(required = false) String productsearch,
			@RequestParam(required = false) String descriptionsearch, @RequestParam(required = false) String contentname) 
					throws JmottoAlsException
	{

		return service.getAllProducts(product, vendor, location, category, content, nodefaultcontent,productsearch
				, descriptionsearch, categorygroup, contentname, inactive);
	}
	
	/**
	 * The als_get_products.cgi interface will retrieve all Product  and information  about those products i.e.( Vendor, Category, Location ) 
	 * available to in your system based on if the products that are active and web enabled.
	 */
	@GetMapping(value = "/getproduct", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getProducts(@RequestBody(required = false) AlsSearchCommonParameters searchParams) throws JmottoAlsException {

		return service.getProducts(searchParams);
	}
}
