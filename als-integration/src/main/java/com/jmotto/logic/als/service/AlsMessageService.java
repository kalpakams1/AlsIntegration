package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsMessageService {

	public ResponseEntity<?> findHotels(String location);
	
}
