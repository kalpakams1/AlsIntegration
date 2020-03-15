package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.Clients;
import com.jmotto.logic.als.service.AlsClientService;

@Service
public class AlsClientServiceImpl extends AlsBaseServiceImpl implements AlsClientService {

	@Override
	public ResponseEntity<?> findClients(String client, String email, Boolean ccinfocheck) {

		Clients searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getClient());
			setHasParam(false);
			if(client == null && email == null)
			{
				JmottoAlsException exception = new JmottoAlsException("Client number or email is required", "AlsClientServiceImpl.findClients");
				throw exception;
			}
			if(null != client)
			{
				appendUrlParam(getAlsUrls().getClientParam() + client);
			}
			if(null != email)
			{
				appendUrlParam(getAlsUrls().getEmailtParam() + email);
			}
			if(ccinfocheck)
			{
				appendUrlParam(getAlsUrls().getCcinfocheckParam() + ccinfocheck);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Clients.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

}
