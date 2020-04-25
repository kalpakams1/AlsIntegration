package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.message.pojo.CompanyDetails;
import com.jmotto.logic.als.service.AlsCompanyService;

@Service
public class AlsCompanyServiceImpl extends AlsBaseServiceImpl implements AlsCompanyService{

	@Override
	public ResponseEntity<?> getCompanyDetails(boolean content) {
		CompanyDetails searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getCompanyInfo());	
			setHasParam(false);
			if(content)
			{
				appendUrlParam(getAlsUrls().getContentParam() + content);
			}
			searchResult = getRestTemplate().getForObject(getURL(), CompanyDetails.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}


}
