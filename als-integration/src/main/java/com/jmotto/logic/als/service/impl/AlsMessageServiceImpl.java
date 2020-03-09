package com.jmotto.logic.als.service.impl;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.message.pojo.hotel.Hotels;
import com.jmotto.logic.als.service.AlsMessageService;

@Service
public class AlsMessageServiceImpl extends AlsBaseServiceImpl implements AlsMessageService{

	static Logger log = Logger.getLogger(AlsMessageServiceImpl.class.getName());
	 
	@Override
	public ResponseEntity<?> findHotels(String location)
	{

		Hotels searchResult = null;
		try {
			String URL = getAlsUrls().getBaseurl() + getAlsUrls().getGethotels();
			if(StringUtils.hasText(location))
			{
				URL += getAlsUrls().getLocationparam() + location;
			}
			searchResult = getRestTemplate().getForObject(URL, Hotels.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	
}
