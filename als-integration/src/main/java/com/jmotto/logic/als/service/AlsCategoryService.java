package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsCategoryService extends AlsBaseService{

	public ResponseEntity<?> findCategories(Integer location, Integer categoryGroup, Boolean includeDesc, Boolean imageurl);
	
}
