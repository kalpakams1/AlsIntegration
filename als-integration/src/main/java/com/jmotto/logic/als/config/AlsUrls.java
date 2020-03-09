package com.jmotto.logic.als.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("alsurls")
public class AlsUrls {

	private String baseurl;
	
	private String gethotels;
	
	private String locationparam;
	
	private String getlocations;
	
	private String gettransactions;
	
	public String getGettransactions() {
		return gettransactions;
	}

	public void setGettransactions(String gettransactions) {
		this.gettransactions = gettransactions;
	}

	public String getGetlocations() {
		return getlocations;
	}

	public void setGetlocations(String getlocations) {
		this.getlocations = getlocations;
	}

	public String getBaseurl() {
		return baseurl;
	}

	public void setBaseurl(String baseurl) {
		this.baseurl = baseurl;
	}

	public String getGethotels() {
		return gethotels;
	}

	public void setGethotels(String gethotels) {
		this.gethotels = gethotels;
	}

	public String getLocationparam() {
		return locationparam;
	}

	public void setLocationparam(String locationparam) {
		this.locationparam = locationparam;
	}
	
}
