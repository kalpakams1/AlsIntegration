package com.jmotto.logic.als.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("alsurls")
public class AlsUrls {

	private String baseurl;
	
	private String gethotels;
	
	private String locationparam;
	
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
