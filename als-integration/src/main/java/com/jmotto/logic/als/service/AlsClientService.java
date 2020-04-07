package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

import com.jmotto.logic.als.message.pojo.Client;
import com.jmotto.logic.als.message.pojo.ClientVoucher;

public interface AlsClientService extends AlsBaseService{

	public ResponseEntity<?> findClients(String client, String email, boolean ccinfocheck);
	
	public ResponseEntity<?> insertClient(Client client);
	
	public ResponseEntity<?> updateClient(Client client);
	
	public ResponseEntity<?> getClientChanges(Integer clientNumber);
	
	public ResponseEntity<?> insertClientVoucher(ClientVoucher clientVoucher);
	
}
