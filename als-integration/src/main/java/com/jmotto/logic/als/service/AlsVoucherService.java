package com.jmotto.logic.als.service;

import org.springframework.http.ResponseEntity;

import com.jmotto.logic.als.message.pojo.ClientVoucher;

public interface AlsVoucherService extends AlsBaseService{

	public ResponseEntity<?> getVouchers(Integer seq, Integer voucher, Integer client, boolean issued);
	
	public ResponseEntity<?> insertVoucher(ClientVoucher clientVoucher);
	
}
