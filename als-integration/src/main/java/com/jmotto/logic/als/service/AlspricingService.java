package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlspricingService extends AlsBaseService{

	public ResponseEntity<?> getProductPricing(Integer product, Integer vendor, Integer productRate);
	
}
