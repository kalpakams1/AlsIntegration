package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.message.pojo.Categories;
import com.jmotto.logic.als.message.pojo.CategoryGroups;
import com.jmotto.logic.als.service.AlsCategoryService;

@Service
public class AlsCategoryServiceImpl extends AlsBaseServiceImpl implements AlsCategoryService {

	@Override
	public ResponseEntity<?> findCategories(Integer location, Integer categoryGroup, boolean includeDesc,
			boolean imageurl) {
		Categories searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getCategories());
			setHasParam(false);
			if(null != location && location>0)
			{
				appendUrlParam(getAlsUrls().getLocationParam()+location.toString());
			}
			if(null != categoryGroup && categoryGroup>0)
			{
				appendUrlParam(getAlsUrls().getCategoryGroupParam()+categoryGroup.toString());
			}
			if(includeDesc)
			{
				appendUrlParam(getAlsUrls().getIncludeDescParam() + includeDesc);
			}
			if(imageurl)
			{
				appendUrlParam(getAlsUrls().getImageUrlParam() + imageurl);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Categories.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	@Override
	public ResponseEntity<?> findCategoryGroups() {
		CategoryGroups searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getCategoryGroups());	
			setHasParam(false);
			searchResult = getRestTemplate().getForObject(getURL(), CategoryGroups.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

}
