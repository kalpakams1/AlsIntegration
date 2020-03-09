package com.jmotto.logic.als.service;

import org.springframework.web.client.RestTemplate;

import com.jmotto.logic.als.config.AlsUrls;

public interface AlsBaseService {

	RestTemplate getRestTemplate();

	AlsUrls getAlsUrls();
}
