/**
 * 
 */
package com.jmotto.logic.als.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.jmotto.logic.als.config.AlsUrls;
import com.jmotto.logic.als.service.AlsBaseService;

/**
 * @author Kalpaka
 *
 */
public class AlsBaseServiceImpl implements AlsBaseService {

	private String URL = "";
	
	private boolean hasParam = false;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
    private AlsUrls alsUrls;

	@Override
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	@Override
	public AlsUrls getAlsUrls() {
		return alsUrls;
	}

	public void appendUrlParam(String param) {
		
		if(!hasParam) {
			URL += getAlsUrls().getFirstParam();
		}
		else {
			URL += getAlsUrls().getAppendParam();
		}
		setHasParam(true);
		URL += param;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	public boolean isHasParam() {
		return hasParam;
	}

	public void setHasParam(boolean hasParam) {
		this.hasParam = hasParam;
	}
}
