package com.jmotto.logic.als.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jmotto.logic.als.message.pojo.Vouchers;
import com.jmotto.logic.als.service.AlsVoucherService;

@Service
public class AlsVoucherServiceImpl extends AlsBaseServiceImpl implements AlsVoucherService {

	@Override
	public ResponseEntity<?> getVouchers(Integer seq, Integer voucher, Integer client, boolean issued) {
		Vouchers searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getVoucher());
			setHasParam(false);
			if (null != seq && seq > 0) {
				appendUrlParam(getAlsUrls().getSeqParam() + seq.toString());
			}
			if (null != voucher && voucher > 0) {
				appendUrlParam(getAlsUrls().getVoucherParam() + voucher.toString());
			}
			if (null != client && client > 0) {
				appendUrlParam(getAlsUrls().getClientParam() + client.toString());
			}
			if (issued) {
				appendUrlParam(getAlsUrls().getIssuedParam() + issued);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Vouchers.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}
}
