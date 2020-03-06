package com.jmotto.logic.als.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.jmotto.logic.als.config.AlsUrls;
import com.jmotto.logic.als.message.pojo.hotel.Hotels;
import com.jmotto.logic.als.service.AlsMessageService;

@Service
public class AlsMessageServiceImpl implements AlsMessageService{

	static Logger log = Logger.getLogger(AlsMessageServiceImpl.class.getName());
	
	@Autowired
	RestTemplate restTemplate;

	@Autowired
    private AlsUrls alsUrls;
	
	@Override
	public ResponseEntity<?> findHotels(String location)
	{

		Hotels searchResult = null;
		try {
			String URL = alsUrls.getBaseurl() + alsUrls.getGethotels();
			if(StringUtils.hasText(location))
			{
				URL += alsUrls.getLocationparam() + location;
			}
			searchResult = restTemplate.getForObject(URL, Hotels.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	
}
