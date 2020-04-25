package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsCompanyService {

	public ResponseEntity<?>  getCompanyDetails(boolean content);

}
