package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsLocationService extends AlsBaseService{

	ResponseEntity<?> findLocations();

}
