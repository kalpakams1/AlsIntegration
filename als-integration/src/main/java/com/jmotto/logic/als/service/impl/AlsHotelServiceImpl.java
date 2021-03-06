package com.jmotto.logic.als.service.impl;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.message.pojo.Hotels;
import com.jmotto.logic.als.service.AlsHotelService;

@Service
public class AlsHotelServiceImpl extends AlsBaseServiceImpl implements AlsHotelService{

	static Logger log = Logger.getLogger(AlsHotelServiceImpl.class.getName());
	 
	@Override
	public ResponseEntity<?> findHotels(String location)
	{

		Hotels searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getHotels());
			setHasParam(false);
			if(StringUtils.hasText(location))
			{
				appendUrlParam(getAlsUrls().getLocationParam()+location.toString());
			}
			searchResult = getRestTemplate().getForObject(getURL(), Hotels.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	
}
