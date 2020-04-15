package com.jmotto.logic.als.service.impl;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.AlsError;
import com.jmotto.logic.als.message.pojo.ClientVoucher;
import com.jmotto.logic.als.message.pojo.VoucherDetails;
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
	
	@Override
	public ResponseEntity<?> insertVoucher(ClientVoucher clientVoucher) throws JmottoAlsException{

		VoucherDetails savedObject = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getInsertVoucher());
			setHasParam(false);
			if(null != clientVoucher.getWebusercode() && clientVoucher.getWebusercode()>0)
			{
				appendUrlParam(getAlsUrls().getWebusercodeParam() + clientVoucher.getWebusercode());
			}
			if(null != clientVoucher.getClient() && clientVoucher.getClient()>0)
			{
				appendUrlParam(getAlsUrls().getClientParam() + clientVoucher.getClient());
			}
			if(!StringUtils.isEmpty(clientVoucher.getActivitydate()))
			{
				appendUrlParam(getAlsUrls().getActivitydateParam() + clientVoucher.getActivitydate());
			}
			if(!StringUtils.isEmpty(clientVoucher.getActivitytime()))
			{
				appendUrlParam(getAlsUrls().getActivityTimeParam() + clientVoucher.getActivitytime());
			}
			if(!StringUtils.isEmpty(clientVoucher.getNotes()))
			{
				appendUrlParam(getAlsUrls().getNotesParam() + clientVoucher.getNotes());
			}
			if(clientVoucher.getBlock())
			{
				appendUrlParam(getAlsUrls().getBlockParam() + clientVoucher.getBlock());
			}
			if(null != clientVoucher.getCount() && clientVoucher.getCount()>0)
			{
				appendUrlParam(getAlsUrls().getCountParam() + clientVoucher.getCount());
			}
			if(null != clientVoucher.getPricingcodeMap())
			{
				Integer i =1;
				for(Map.Entry<Integer, Integer> entry : clientVoucher.getPricingcodeMap().entrySet())
				{
					Integer pricingCode = (Integer) entry.getKey();
					Integer quantity = (Integer) entry.getValue();
					appendUrlParam(getAlsUrls().getPricingCodeParam().replaceFirst("#", i.toString()) + pricingCode);
					appendUrlParam(getAlsUrls().getQuantityParam().replaceFirst("#", i.toString()) + quantity);
					i++;
				}
			}
			if(clientVoucher.getCustompayment())
			{
				appendUrlParam(getAlsUrls().getCustomPaymentParam() + clientVoucher.getCustompayment());
			}
			if(null != clientVoucher.getAgency() && clientVoucher.getAgency()>0)
			{
				appendUrlParam(getAlsUrls().getAgencyParam() + clientVoucher.getAgency());
			}
			if(clientVoucher.getUnissued())
			{
				appendUrlParam(getAlsUrls().getUnissuedParam() + clientVoucher.getUnissued());
			}
			
			savedObject = getRestTemplate().getForObject(getURL(), VoucherDetails.class);
			if(null == savedObject.getVouchers())
			{
				AlsError alsError = getRestTemplate().getForObject(getURL(), AlsError.class);
				throw new JmottoAlsException("ALS Error:- "+alsError.getRow().get(0).getError(), "AlsClientServiceImpl.insertVoucher");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(savedObject);
	}

}
