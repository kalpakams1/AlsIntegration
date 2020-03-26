package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsTransactionService extends AlsBaseService {

	ResponseEntity<?> findTransactions();

}
