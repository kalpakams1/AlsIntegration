package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

public interface AlsVoucherService extends AlsBaseService{

	public ResponseEntity<?> getVouchers(Integer seq, Integer voucher, Integer client, boolean issued);
}
