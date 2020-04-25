package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

import com.jmotto.logic.als.message.pojo.AlsSearchCommonParameters;

public interface AlsVendorService {

	public ResponseEntity<?> getVendors(AlsSearchCommonParameters searchParams);

}
