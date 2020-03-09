package com.jmotto.logic.als.service.impl;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.controller.AlsTransactionService;
import com.jmotto.logic.als.message.pojo.hotel.Transactiontypes;

@Service
public class AlsTransactionServiceImpl extends AlsBaseServiceImpl implements AlsTransactionService {

	static Logger log = Logger.getLogger(AlsTransactionServiceImpl.class.getName());
	
	@Override
	public ResponseEntity<?> findTransactions() {
		Transactiontypes searchResult = null;
		try {
			String URL = getAlsUrls().getBaseurl() + getAlsUrls().getGettransactions();
			searchResult = getRestTemplate().getForObject(URL, Transactiontypes.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}
}
