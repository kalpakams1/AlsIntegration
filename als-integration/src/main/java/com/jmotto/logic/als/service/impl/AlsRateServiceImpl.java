package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.message.pojo.RateAdditionals;
import com.jmotto.logic.als.message.pojo.Rates;
import com.jmotto.logic.als.service.AlsRateService;

@Service
public class AlsRateServiceImpl extends AlsBaseServiceImpl implements AlsRateService {

	@Override
	public ResponseEntity<?> getRateAdditional(Integer productrate) {
		RateAdditionals searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getRateAdditional());
			setHasParam(false);
			if(null != productrate && productrate>0)
			{
				appendUrlParam(getAlsUrls().getProductrateParam()+productrate.toString());
			}
			searchResult = getRestTemplate().getForObject(getURL(), RateAdditionals.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	@Override
	public ResponseEntity<?> getRates(Integer location, Integer category, Integer vendor, Integer product,
			String bookingdate, String activitydate, String date, boolean productinfo, boolean content,
			boolean wholesale) {
		Rates searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getRates());
			setHasParam(false);
			if (null != location && location > 0) {
				appendUrlParam(getAlsUrls().getLocationParam() + location.toString());
			}
			if (null != category && category > 0) {
				appendUrlParam(getAlsUrls().getCategoryParam() + category.toString());
			}
			if (null != vendor && vendor > 0) {
				appendUrlParam(getAlsUrls().getVendorParam() + vendor.toString());
			}
			if (null != product && product > 0) {
				appendUrlParam(getAlsUrls().getProductParam() + product.toString());
			}
			if (StringUtils.hasText(bookingdate)) {
				appendUrlParam(getAlsUrls().getBookingdateParam() + bookingdate);
			}
			if (StringUtils.hasText(activitydate)) {
				appendUrlParam(getAlsUrls().getActivitydateParam() + activitydate);
			}
			if (StringUtils.hasText(date)) {
				appendUrlParam(getAlsUrls().getDateParam() + date);
			}
			if (productinfo) {
				appendUrlParam(getAlsUrls().getProductinfoParam() + productinfo);
			}
			if (content) {
				appendUrlParam(getAlsUrls().getContentParam() + content);
			}
			if (wholesale) {
				appendUrlParam(getAlsUrls().getWholesaleParam() + wholesale);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Rates.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}
}
