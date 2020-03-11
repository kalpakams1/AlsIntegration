package com.jmotto.logic.als.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("alsurls")
public class AlsUrls {

	private String baseurl;
	
	private String hotels;
	
	private String locationParam;
	
	private String locations;
	
	private String transactions;
	
	private String client;
	
	private String categories;
	
	private String firstParam;
	
	private String appendParam;
	
	private String categoryGroupParam;
	
	private String includeDescParam;
	
	private String imageUrlParam;
	
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
