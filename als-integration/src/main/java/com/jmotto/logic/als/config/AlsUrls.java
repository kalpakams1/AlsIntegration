package com.jmotto.logic.als.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("alsurls")
public class AlsUrls {

	//URLS
	private String baseurl;
	
	private String hotels;
	
	private String locations;
	
	private String transactions;
	
	private String client;
	
	private String categories;
	
	private String rateAdditional;
	
	private String rates;
	
	private String voucher;
	
	private String productPricing;
	
	//Parameters
	private String firstParam;
	
	private String appendParam;
	
	private String categoryGroupParam;
	
	private String includeDescParam;
	
	private String imageUrlParam;
	
	private String clientchange;
	
	private String clientParam;
	
	private String emailtParam;
	
	private String ccinfocheckParam;
	
	private String locationParam;
	
	private String productrateParam;
	
	private String categoryParam;
	
	private String vendorParam;
	
	private String productParam;
	
	private String bookingdateParam;
	
	private String activitydateParam;
	
	private String dateParam;	
	
	private String productinfoParam;
	
	private String contentParam;	
	
	private String wholesaleParam;
	
	private String seqParam;
	
	private String voucherParam;
	
	private String issuedParam;
	
	public String getProductPricing() {
		return productPricing;
	}

	public void setProductPricing(String productPricing) {
		this.productPricing = productPricing;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public String getSeqParam() {
		return seqParam;
	}

	public void setSeqParam(String seqParam) {
		this.seqParam = seqParam;
	}

	public String getVoucherParam() {
		return voucherParam;
	}

	public void setVoucherParam(String voucherParam) {
		this.voucherParam = voucherParam;
	}

	public String getIssuedParam() {
		return issuedParam;
	}

	public void setIssuedParam(String issuedParam) {
		this.issuedParam = issuedParam;
	}

	public String getBookingdateParam() {
		return bookingdateParam;
	}

	public void setBookingdateParam(String bookingdateParam) {
		this.bookingdateParam = bookingdateParam;
	}

	public String getActivitydateParam() {
		return activitydateParam;
	}

	public void setActivitydateParam(String activitydateParam) {
		this.activitydateParam = activitydateParam;
	}

	public String getDateParam() {
		return dateParam;
	}

	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}

	public String getProductinfoParam() {
		return productinfoParam;
	}

	public void setProductinfoParam(String productinfoParam) {
		this.productinfoParam = productinfoParam;
	}

	public String getContentParam() {
		return contentParam;
	}

	public void setContentParam(String contentParam) {
		this.contentParam = contentParam;
	}

	public String getWholesaleParam() {
		return wholesaleParam;
	}

	public void setWholesaleParam(String wholesaleParam) {
		this.wholesaleParam = wholesaleParam;
	}

	public String getProductParam() {
		return productParam;
	}

	public void setProductParam(String productParam) {
		this.productParam = productParam;
	}

	public String getVendorParam() {
		return vendorParam;
	}

	public void setVendorParam(String vendorParam) {
		this.vendorParam = vendorParam;
	}

	public String getCategoryParam() {
		return categoryParam;
	}

	public void setCategoryParam(String categoryParam) {
		this.categoryParam = categoryParam;
	}

	public String getProductrateParam() {
		return productrateParam;
	}

	public void setProductrateParam(String productrateParam) {
		this.productrateParam = productrateParam;
	}

	public String getRateAdditional() {
		return rateAdditional;
	}

	public void setRateAdditional(String rateAdditional) {
		this.rateAdditional = rateAdditional;
	}

	public String getRates() {
		return rates;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}

	public String getClientParam() {
		return clientParam;
	}

	public void setClientParam(String clientParam) {
		this.clientParam = clientParam;
	}

	public String getEmailtParam() {
		return emailtParam;
	}

	public void setEmailtParam(String emailtParam) {
		this.emailtParam = emailtParam;
	}

	public String getCcinfocheckParam() {
		return ccinfocheckParam;
	}

	public void setCcinfocheckParam(String ccinfocheckParam) {
		this.ccinfocheckParam = ccinfocheckParam;
	}

	public String getClientchange() {
		return clientchange;
	}

	public void setClientchange(String clientchange) {
		this.clientchange = clientchange;
	}

	public String getImageUrlParam() {
		return imageUrlParam;
	}

	public void setImageUrlParam(String imageUrlParam) {
		this.imageUrlParam = imageUrlParam;
	}

	public String getIncludeDescParam() {
		return includeDescParam;
	}

	public void setIncludeDescParam(String includeDescParam) {
		this.includeDescParam = includeDescParam;
	}

	public String getCategoryGroupParam() {
		return categoryGroupParam;
	}

	public void setCategoryGroupParam(String categoryGroupParam) {
		this.categoryGroupParam = categoryGroupParam;
	}

	public String getBaseurl() {
		return baseurl;
	}

	public void setBaseurl(String baseurl) {
		this.baseurl = baseurl;
	}

	public String getHotels() {
		return hotels;
	}

	public void setHotels(String hotels) {
		this.hotels = hotels;
	}

	public String getLocationParam() {
		return locationParam;
	}

	public void setLocationParam(String locationParam) {
		this.locationParam = locationParam;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public String getTransactions() {
		return transactions;
	}

	public void setTransactions(String transactions) {
		this.transactions = transactions;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getFirstParam() {
		return firstParam;
	}

	public void setFirstParam(String firstParam) {
		this.firstParam = firstParam;
	}

	public String getAppendParam() {
		return appendParam;
	}

	public void setAppendParam(String appendParam) {
		this.appendParam = appendParam;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

}
