package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsRateService extends AlsBaseService{

	public ResponseEntity<?> getRateAdditional(Integer productrate);

	public ResponseEntity<?> getRates(Integer location, Integer category, Integer vendor, Integer product,
			String bookingdate, String activitydate, String date, boolean productinfo, boolean content,
			boolean wholesale);
	
}
