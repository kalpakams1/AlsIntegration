package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.Client;
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

	@Override
	public ResponseEntity<?> insertClient(Integer webusercode, String lastname, String email, String arrivaldate,
			String departuredate, Integer cellphone, Integer faxphone, Integer homephone) {
		Client savedObject = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getInsertClient());
			setHasParam(false);
			if(webusercode != null && webusercode >0)
			{
				appendUrlParam(getAlsUrls().getWebusercodeParam() + webusercode);
			}
			if(!StringUtils.isEmpty(lastname))
			{
				appendUrlParam(getAlsUrls().getLastnameParam() + lastname);
			}
			if(!StringUtils.isEmpty(email))
			{
				appendUrlParam(getAlsUrls().getEmailParam() + email);
			}
			if(!StringUtils.isEmpty(arrivaldate))
			{
				appendUrlParam(getAlsUrls().getArrivaldateParam() + arrivaldate);
			}
			if(!StringUtils.isEmpty(departuredate))
			{
				appendUrlParam(getAlsUrls().getDeparturedateParam() + departuredate);
			}
			if(cellphone != null && cellphone >0)
			{
				appendUrlParam(getAlsUrls().getCellphoneParam() + cellphone);
			}
			if(faxphone != null && faxphone >0)
			{
				appendUrlParam(getAlsUrls().getFaxphoneParam() + faxphone);
			}
			if(homephone != null && homephone >0)
			{
				appendUrlParam(getAlsUrls().getHomephoneParam() + homephone);
			}
			savedObject = getRestTemplate().getForObject(getURL(), Client.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(savedObject);
	}

}
