package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsClientService extends AlsBaseService{

	public ResponseEntity<?> findClients(String client, String email, Boolean ccinfocheck);
	
	public ResponseEntity<?> insertClient(Integer webusercode,String lastname,String email,String arrivaldate,
			String departuredate,Integer cellphone,Integer faxphone,Integer homephone);
}
