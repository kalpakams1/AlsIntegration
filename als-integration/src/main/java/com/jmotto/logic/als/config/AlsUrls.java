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
	
	private String insertClient;
	
	private String clientChanges;
	
	private String updateClient;
	
	private String insertVoucher;
	
	private String productSearch;
	
	//Parameters
	
	private String nodeFaultContentParam;
	
	private String activityTimeParam;
	
	private String firstParam;
	
	private String appendParam;
	
	private String categoryGroupParam;
	
	private String includeDescParam;
	
	private String imageUrlParam;
	
	private String clientParam;
	
	private String clientCodeParam;
	
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
	
	private String webusercodeParam;	
	
	private String lastnameParam;		
	
	private String emailParam;			
	
	private String arrivaldateParam;	
	
	private String departuredateParam;	
	
	private String cellphoneParam;		
	
	private String faxphoneParam;		
	
	private String homephoneParam;		

	private String firstNameParam;
	
	private String hotelNameParam;
	
	private String roomNumberParam;
	
	private String workphoneParam;
	
	private String otherphoneParam;
	
	private String notesParam;
	
	private String hotelParam;
	
	private String codeParam;
	
	private String blockParam;
	
	private String countParam;
	
	private String pricingCodeParam;
	
	private String quantityParam;
	
	private String customPaymentParam;
	
	private String agencyParam;
	
	private String unissuedParam;
	
	private String productSearchParam;
	
	private String descriptionSearchParam;
	
	private String contentNameParam;
	
	private String inactiveParam;
	
	public String getInactiveParam() {
		return inactiveParam;
	}

	public void setInactiveParam(String inactiveParam) {
		this.inactiveParam = inactiveParam;
	}

	public String getDescriptionSearchParam() {
		return descriptionSearchParam;
	}

	public void setDescriptionSearchParam(String descriptionSearchParam) {
		this.descriptionSearchParam = descriptionSearchParam;
	}

	public String getContentNameParam() {
		return contentNameParam;
	}

	public void setContentNameParam(String contentNameParam) {
		this.contentNameParam = contentNameParam;
	}

	public String getProductSearchParam() {
		return productSearchParam;
	}

	public void setProductSearchParam(String productSearchParam) {
		this.productSearchParam = productSearchParam;
	}

	public String getNodeFaultContentParam() {
		return nodeFaultContentParam;
	}

	public void setNodeFaultContentParam(String nodeFaultContentParam) {
		this.nodeFaultContentParam = nodeFaultContentParam;
	}

	public String getProductSearch() {
		return productSearch;
	}

	public void setProductSearch(String productSearch) {
		this.productSearch = productSearch;
	}

	public String getUnissuedParam() {
		return unissuedParam;
	}

	public void setUnissuedParam(String unissuedParam) {
		this.unissuedParam = unissuedParam;
	}

	public String getAgencyParam() {
		return agencyParam;
	}

	public void setAgencyParam(String agencyParam) {
		this.agencyParam = agencyParam;
	}

	public String getCustomPaymentParam() {
		return customPaymentParam;
	}

	public void setCustomPaymentParam(String customPaymentParam) {
		this.customPaymentParam = customPaymentParam;
	}

	public String getQuantityParam() {
		return quantityParam;
	}

	public void setQuantityParam(String quantityParam) {
		this.quantityParam = quantityParam;
	}

	public String getPricingCodeParam() {
		return pricingCodeParam;
	}

	public void setPricingCodeParam(String pricingCodeParam) {
		this.pricingCodeParam = pricingCodeParam;
	}

	public String getCountParam() {
		return countParam;
	}

	public void setCountParam(String countParam) {
		this.countParam = countParam;
	}

	public String getBlockParam() {
		return blockParam;
	}

	public void setBlockParam(String blockParam) {
		this.blockParam = blockParam;
	}

	public String getActivityTimeParam() {
		return activityTimeParam;
	}

	public void setActivityTimeParam(String activityTimeParam) {
		this.activityTimeParam = activityTimeParam;
	}

	public String getInsertVoucher() {
		return insertVoucher;
	}

	public void setInsertVoucher(String insertVoucher) {
		this.insertVoucher = insertVoucher;
	}

	public String getCodeParam() {
		return codeParam;
	}

	public void setCodeParam(String codeParam) {
		this.codeParam = codeParam;
	}

	public String getHotelParam() {
		return hotelParam;
	}

	public void setHotelParam(String hotelParam) {
		this.hotelParam = hotelParam;
	}

	private String webreferenceParam;
	    	
	public String getWebusercodeParam() {
		return webusercodeParam;
	}

	public void setWebusercodeParam(String webusercodeParam) {
		this.webusercodeParam = webusercodeParam;
	}

	public String getLastnameParam() {
		return lastnameParam;
	}

	public void setLastnameParam(String lastname) {
		this.lastnameParam = lastname;
	}

	public String getEmailParam() {
		return emailParam;
	}

	public void setEmailParam(String email) {
		this.emailParam = email;
	}

	public String getArrivaldateParam() {
		return arrivaldateParam;
	}

	public void setArrivaldateParam(String arrivaldate) {
		this.arrivaldateParam = arrivaldate;
	}

	public String getDeparturedateParam() {
		return departuredateParam;
	}

	public void setDeparturedateParam(String departuredate) {
		this.departuredateParam = departuredate;
	}

	public String getCellphoneParam() {
		return cellphoneParam;
	}

	public void setCellphoneParam(String cellphone) {
		this.cellphoneParam = cellphone;
	}

	public String getFaxphoneParam() {
		return faxphoneParam;
	}

	public void setFaxphoneParam(String faxphone) {
		this.faxphoneParam = faxphone;
	}

	public String getHomephoneParam() {
		return homephoneParam;
	}

	public void setHomephoneParam(String homephone) {
		this.homephoneParam = homephone;
	}

	public String getInsertClient() {
		return insertClient;
	}

	public void setInsertClient(String insertClient) {
		this.insertClient = insertClient;
	}

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

	public String getCcinfocheckParam() {
		return ccinfocheckParam;
	}

	public void setCcinfocheckParam(String ccinfocheckParam) {
		this.ccinfocheckParam = ccinfocheckParam;
	}

	public String getClientChanges() {
		return clientChanges;
	}

	public void setClientChanges(String clientChanges) {
		this.clientChanges = clientChanges;
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

	public String getUpdateClient() {
		return updateClient;
	}

	public void setUpdateClient(String updateClient) {
		this.updateClient = updateClient;
	}

	public String getClientCodeParam() {
		return clientCodeParam;
	}

	public void setClientCodeParam(String clientCodeParam) {
		this.clientCodeParam = clientCodeParam;
	}

	public String getFirstNameParam() {
		return firstNameParam;
	}

	public void setFirstNameParam(String firstNameParam) {
		this.firstNameParam = firstNameParam;
	}

	public String getHotelNameParam() {
		return hotelNameParam;
	}

	public void setHotelNameParam(String hotelNameParam) {
		this.hotelNameParam = hotelNameParam;
	}

	public String getRoomNumberParam() {
		return roomNumberParam;
	}

	public void setRoomNumberParam(String roomNumberParam) {
		this.roomNumberParam = roomNumberParam;
	}

	public String getWorkphoneParam() {
		return workphoneParam;
	}

	public void setWorkphoneParam(String workphoneParam) {
		this.workphoneParam = workphoneParam;
	}

	public String getOtherphoneParam() {
		return otherphoneParam;
	}

	public void setOtherphoneParam(String otherphoneParam) {
		this.otherphoneParam = otherphoneParam;
	}

	public String getNotesParam() {
		return notesParam;
	}

	public void setNotesParam(String notesParam) {
		this.notesParam = notesParam;
	}

	public String getWebreferenceParam() {
		return webreferenceParam;
	}

	public void setWebreferenceParam(String webreferenceParam) {
		this.webreferenceParam = webreferenceParam;
	}

}
