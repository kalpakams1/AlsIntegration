package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsMessageService extends AlsBaseService{

	public ResponseEntity<?> findHotels(String location);
	
}
