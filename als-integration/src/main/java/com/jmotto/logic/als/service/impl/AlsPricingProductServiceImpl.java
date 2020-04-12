package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.message.pojo.Pricings;
import com.jmotto.logic.als.message.pojo.ProductsDetails;
import com.jmotto.logic.als.service.AlsPricingProductService;

@Service
public class AlsPricingProductServiceImpl extends AlsBaseServiceImpl implements AlsPricingProductService {

	@Override
	public ResponseEntity<?> getProductPricing(Integer product, Integer vendor, Integer productRate) {
		Pricings searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getProductPricing());
			setHasParam(false);
			if (null != product && product > 0) {
				appendUrlParam(getAlsUrls().getProductParam() + product);
			}
			if (null != vendor && vendor > 0) {
				appendUrlParam(getAlsUrls().getVendorParam() + vendor);
			}
			if (null != productRate && productRate > 0) {
				appendUrlParam(getAlsUrls().getProductrateParam() + productRate);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Pricings.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	@Override
	public ResponseEntity<?> getAllProducts(Integer product, Integer vendor, Integer location, Integer category,
			boolean content, boolean nodefaultcontent, String productsearch, String descriptionsearch,
			Integer categorygroup, String contentname, boolean inactive) {
		ProductsDetails searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getProductSearch());
			setHasParam(false);
			if (null != product && product > 0) {
				appendUrlParam(getAlsUrls().getProductParam() + product);
			}
			if (null != vendor && vendor > 0) {
				appendUrlParam(getAlsUrls().getVendorParam() + vendor);
			}
			if (null != location && location > 0) {
				appendUrlParam(getAlsUrls().getLocationParam() + location);
			}
			if (null != category && category > 0) {
				appendUrlParam(getAlsUrls().getCategoryParam() + category);
			}
			if(content) {
				appendUrlParam(getAlsUrls().getContentParam() + content);
			}
			if(nodefaultcontent) {
				appendUrlParam(getAlsUrls().getNodeFaultContentParam() + nodefaultcontent);
			}
			if(StringUtils.hasText(productsearch))
			{
				appendUrlParam(getAlsUrls().getProductSearchParam()+productsearch);
			}
			if(StringUtils.hasText(descriptionsearch))
			{
				appendUrlParam(getAlsUrls().getDescriptionSearchParam()+descriptionsearch);
			}
			if(StringUtils.hasText(contentname))
			{
				appendUrlParam(getAlsUrls().getContentNameParam()+contentname);
			}
			if (null != categorygroup && categorygroup > 0) {
				appendUrlParam(getAlsUrls().getCategoryGroupParam() + categorygroup);
			}
			if(inactive) {
				appendUrlParam(getAlsUrls().getInactiveParam() + inactive);
			}
			searchResult = getRestTemplate().getForObject(getURL(), ProductsDetails.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}


}
