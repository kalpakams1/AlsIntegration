package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsClientService extends AlsBaseService{

	public ResponseEntity<?> findClients(String client, String email, Boolean ccinfocheck);
	
}
