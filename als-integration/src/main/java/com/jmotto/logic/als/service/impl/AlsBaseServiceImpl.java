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

}
