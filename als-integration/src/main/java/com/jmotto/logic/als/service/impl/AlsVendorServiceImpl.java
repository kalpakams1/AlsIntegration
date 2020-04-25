package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.message.pojo.AlsSearchCommonParameters;
import com.jmotto.logic.als.message.pojo.Vendors;
import com.jmotto.logic.als.service.AlsVendorService;

@Service
public class AlsVendorServiceImpl extends AlsBaseServiceImpl implements AlsVendorService {

	@Override
	public ResponseEntity<?> getVendors(AlsSearchCommonParameters searchParams) {
		Vendors searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getVendors());
			setHasParam(false);
			if(null != searchParams) {
				if (null != searchParams.getCategory() && searchParams.getCategory() > 0) {
					appendUrlParam(getAlsUrls().getCategoryParam() + searchParams.getCategory());
				}
				if (null != searchParams.getCategorygroup() && searchParams.getCategorygroup() > 0) {
					appendUrlParam(getAlsUrls().getCategoryGroupParam() + searchParams.getCategorygroup());
				}
				if (null != searchParams.getLocation() && searchParams.getLocation() > 0) {
					appendUrlParam(getAlsUrls().getLocationParam() + searchParams.getLocation());
				}
				if (null != searchParams.getProduct() && searchParams.getProduct() > 0) {
					appendUrlParam(getAlsUrls().getProductParam() + searchParams.getProduct());
				}
				if (null != searchParams.getVendor() && searchParams.getVendor() > 0) {
					appendUrlParam(getAlsUrls().getVendorParam() + searchParams.getVendor());
				}
				if(searchParams.getContent()) {
					appendUrlParam(getAlsUrls().getContentParam() + searchParams.getContent());
				}
				if(searchParams.getInactive()) {
					appendUrlParam(getAlsUrls().getInactiveParam() + searchParams.getInactive());
				}
				if(searchParams.getIncludedesc()) {
					appendUrlParam(getAlsUrls().getIncludeDescParam() + searchParams.getIncludedesc());
				}
				if(searchParams.getNodefaultcontent()) {
					appendUrlParam(getAlsUrls().getNodeFaultContentParam() + searchParams.getNodefaultcontent());
				}
				if(StringUtils.hasText(searchParams.getProductsearch()))
				{
					appendUrlParam(getAlsUrls().getProductSearchParam() + searchParams.getProductsearch());
				}
				if(StringUtils.hasText(searchParams.getDescriptionsearch()))
				{
					appendUrlParam(getAlsUrls().getDescriptionSearchParam() + searchParams.getDescriptionsearch());
				}
				if(StringUtils.hasText(searchParams.getContentname()))
				{
					appendUrlParam(getAlsUrls().getContentNameParam() + searchParams.getContentname());
				}
			}
			searchResult = getRestTemplate().getForObject(getURL(), Vendors.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}


}
