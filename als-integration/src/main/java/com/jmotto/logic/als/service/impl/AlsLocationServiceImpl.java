package com.jmotto.logic.als.service.impl;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.message.pojo.Locations;
import com.jmotto.logic.als.service.AlsLocationService;

@Service
public class AlsLocationServiceImpl extends AlsBaseServiceImpl implements AlsLocationService {

	static Logger log = Logger.getLogger(AlsLocationServiceImpl.class.getName());
	
	@Override
	public ResponseEntity<?> findLocations() {
		Locations searchResult = null;
		try {
			searchResult = getRestTemplate().getForObject(getAlsUrls().getBaseurl() + getAlsUrls().getLocations(), Locations.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}
}
