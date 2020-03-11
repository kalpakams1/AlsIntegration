package com.jmotto.logic.als.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.service.AlsClientService;

@Service
public class AlsClientServiceImpl extends AlsBaseServiceImpl implements AlsClientService {

	@Override
	public ResponseEntity<?> findClients(String client, String email, Boolean ccinfocheck) {
		// TODO Auto-generated method stub
		return null;
	}

}
