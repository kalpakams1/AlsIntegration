package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.message.pojo.Pricings;
import com.jmotto.logic.als.service.AlspricingService;

@Service
public class AlsPricingServiceImpl extends AlsBaseServiceImpl implements AlspricingService {

	@Override
	public ResponseEntity<?> getProductPricing(Integer product, Integer vendor, Integer productRate) {
		Pricings searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getProductPricing());
			setHasParam(false);
			if (null != product && product > 0) {
				appendUrlParam(getAlsUrls().getProductParam() + product.toString());
			}
			if (null != vendor && vendor > 0) {
				appendUrlParam(getAlsUrls().getVendorParam() + vendor.toString());
			}
			if (null != productRate && productRate > 0) {
				appendUrlParam(getAlsUrls().getProductrateParam() + productRate.toString());
			}
			searchResult = getRestTemplate().getForObject(getURL(), Pricings.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}
}
