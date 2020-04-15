package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

import com.jmotto.logic.als.message.pojo.AlsSearchCommonParameters;

public interface AlsPricingProductService extends AlsBaseService{

	public ResponseEntity<?> getProductPricing(Integer product, Integer vendor, Integer productRate);
	
	public ResponseEntity<?> getAllProducts(Integer product, Integer vendor, Integer location,
			Integer category, boolean content,boolean nodefaultcontent, String productsearch,
			String descriptionsearch, Integer categorygroup, String contentname, boolean inactive);

	public ResponseEntity<?> getProducts(AlsSearchCommonParameters searchParams);
	
}
