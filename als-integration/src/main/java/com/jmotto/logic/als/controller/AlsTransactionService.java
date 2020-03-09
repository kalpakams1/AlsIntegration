package com.jmotto.logic.als.controller;

import org.springframework.http.ResponseEntity;

import com.jmotto.logic.als.service.AlsBaseService;

public interface AlsTransactionService extends AlsBaseService {

	ResponseEntity<?> findTransactions();

}
