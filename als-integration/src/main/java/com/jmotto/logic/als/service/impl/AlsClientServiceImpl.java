package com.jmotto.logic.als.service.impl;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.AlsError;
import com.jmotto.logic.als.message.pojo.Client;
import com.jmotto.logic.als.message.pojo.ClientChanges;
import com.jmotto.logic.als.message.pojo.ClientVoucher;
import com.jmotto.logic.als.message.pojo.Clients;
import com.jmotto.logic.als.message.pojo.Vouchers;
import com.jmotto.logic.als.service.AlsClientService;

@Service
public class AlsClientServiceImpl extends AlsBaseServiceImpl implements AlsClientService {

	@Override
	public ResponseEntity<?> findClients(String client, String email, boolean ccinfocheck) {

		Clients searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getClient());
			setHasParam(false);
			if(client == null && email == null)
			{
				JmottoAlsException exception = new JmottoAlsException("Client number or email is required", "AlsClientServiceImpl.findClients");
				throw exception;
			}
			if(null != client)
			{
				appendUrlParam(getAlsUrls().getClientParam() + client);
			}
			if(null != email)
			{
				appendUrlParam(getAlsUrls().getEmailParam() + email);
			}
			if(ccinfocheck)
			{
				appendUrlParam(getAlsUrls().getCcinfocheckParam() + ccinfocheck);
			}
			searchResult = getRestTemplate().getForObject(getURL(), Clients.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	@Override
	public ResponseEntity<?> insertClient(Client client) throws JmottoAlsException{
		Clients savedObject = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getInsertClient());
			setHasParam(false);
			if(!StringUtils.isEmpty(client.getWebusercode()))
			{
				appendUrlParam(getAlsUrls().getWebusercodeParam() + client.getWebusercode());
			}
			if(!StringUtils.isEmpty(client.getFirstname()))
			{
				appendUrlParam(getAlsUrls().getFirstNameParam() + client.getFirstname());
			}
			if(!StringUtils.isEmpty(client.getLastname()))
			{
				appendUrlParam(getAlsUrls().getLastnameParam() + client.getLastname());
			}
			if(!StringUtils.isEmpty(client.getEmail()))
			{
				appendUrlParam(getAlsUrls().getEmailParam() + client.getEmail());
			}
			if(!StringUtils.isEmpty(client.getArrivaldate()))
			{
				appendUrlParam(getAlsUrls().getArrivaldateParam() + client.getArrivaldate());
			}
			if(!StringUtils.isEmpty(client.getDeparturedate()))
			{
				appendUrlParam(getAlsUrls().getDeparturedateParam() + client.getDeparturedate());
			}
			if(!StringUtils.isEmpty(client.getCellphone()))
			{
				appendUrlParam(getAlsUrls().getCellphoneParam() + client.getCellphone());
			}
			if(!StringUtils.isEmpty(client.getFaxphone()))
			{
				appendUrlParam(getAlsUrls().getFaxphoneParam() + client.getFaxphone());
			}
			if(!StringUtils.isEmpty(client.getHomephone()))
			{
				appendUrlParam(getAlsUrls().getHomephoneParam() + client.getHomephone());
			}
			if(!StringUtils.isEmpty(client.getHotel()))
			{
				appendUrlParam(getAlsUrls().getHotelParam() + client.getHotel());
			}
			if(!StringUtils.isEmpty(client.getRoom()))
			{
				appendUrlParam(getAlsUrls().getRoomNumberParam() + client.getRoom());
			}
			if(!StringUtils.isEmpty(client.getWorkphone()))
			{
				appendUrlParam(getAlsUrls().getWorkphoneParam() + client.getWorkphone());
			}
			if(!StringUtils.isEmpty(client.getOtherphone()))
			{
				appendUrlParam(getAlsUrls().getOtherphoneParam() + client.getOtherphone());
			}
			/*
			 * Notes will be inserted automatically only uncomment if we need to append any additional information
			 * if(!StringUtils.isEmpty(client.getNotes())) {
			 * appendUrlParam(getAlsUrls().getNotesParam() +
			 * client.getNotes().replaceAll(" ", "%20")); }
			 */
			savedObject = getRestTemplate().getForObject(getURL(), Clients.class);
			if(null == savedObject.getClient().get(0).getClient())
			{
				AlsError alsError = getRestTemplate().getForObject(getURL(), AlsError.class);
				throw new JmottoAlsException("ALS Error:- "+alsError.getRow().get(0).getError(), "AlsClientServiceImpl.insertClient");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(savedObject);
	}

	@Override
	public ResponseEntity<?> updateClient(Client client) throws JmottoAlsException{
		Clients savedObject = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getUpdateClient());
			setHasParam(false);
			if(!StringUtils.isEmpty(client.getClient()))
			{
				appendUrlParam(getAlsUrls().getClientParam() + client.getClient());
			}
			if(!StringUtils.isEmpty(client.getWebusercode()))
			{
				appendUrlParam(getAlsUrls().getWebusercodeParam() + client.getWebusercode());
			}
			if(!StringUtils.isEmpty(client.getFirstname()))
			{
				appendUrlParam(getAlsUrls().getFirstNameParam() + client.getFirstname());
			}
			if(!StringUtils.isEmpty(client.getLastname()))
			{
				appendUrlParam(getAlsUrls().getLastnameParam() + client.getLastname());
			}
			if(!StringUtils.isEmpty(client.getEmail()))
			{
				appendUrlParam(getAlsUrls().getEmailParam() + client.getEmail());
			}
			if(!StringUtils.isEmpty(client.getArrivaldate()))
			{
				appendUrlParam(getAlsUrls().getArrivaldateParam() + client.getArrivaldate());
			}
			if(!StringUtils.isEmpty(client.getDeparturedate()))
			{
				appendUrlParam(getAlsUrls().getDeparturedateParam() + client.getDeparturedate());
			}
			if(!StringUtils.isEmpty(client.getCellphone()))
			{
				appendUrlParam(getAlsUrls().getCellphoneParam() + client.getCellphone());
			}
			if(!StringUtils.isEmpty(client.getFaxphone()))
			{
				appendUrlParam(getAlsUrls().getFaxphoneParam() + client.getFaxphone());
			}
			if(!StringUtils.isEmpty(client.getHomephone()))
			{
				appendUrlParam(getAlsUrls().getHomephoneParam() + client.getHomephone());
			}		
			if(!StringUtils.isEmpty(client.getHotelname()))
			{
				appendUrlParam(getAlsUrls().getHotelNameParam() + client.getHotelname());
			}
			if(!StringUtils.isEmpty(client.getRoom()))
			{
				appendUrlParam(getAlsUrls().getRoomNumberParam() + client.getRoom());
			}
			if(!StringUtils.isEmpty(client.getWorkphone()))
			{
				appendUrlParam(getAlsUrls().getWorkphoneParam() + client.getWorkphone());
			}
			if(!StringUtils.isEmpty(client.getOtherphone()))
			{
				appendUrlParam(getAlsUrls().getOtherphoneParam() + client.getOtherphone());
			}
			if(!StringUtils.isEmpty(client.getNotes()))
			{
				appendUrlParam(getAlsUrls().getNotesParam() + client.getNotes());
			}
			if(!StringUtils.isEmpty(client.getWebreference()))
			{
				appendUrlParam(getAlsUrls().getWebreferenceParam() + client.getWebreference());
			}
			
			savedObject = getRestTemplate().getForObject(getURL(), Clients.class);
			if(null == savedObject.getClient().get(0).getCode())
			{
				AlsError alsError = getRestTemplate().getForObject(getURL(), AlsError.class);
				throw new JmottoAlsException("ALS Error:- "+alsError.getRow().get(0).getError(), "AlsClientServiceImpl.updateClient");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(savedObject);
	}

	@Override
	public ResponseEntity<?> getClientChanges(Integer clientNumber) {
		ClientChanges searchResult = null;
		try {
			setURL(getAlsUrls().getBaseurl() + getAlsUrls().getClientChanges());
			setHasParam(false);
			appendUrlParam(getAlsUrls().getClientParam() + clientNumber);
			searchResult = getRestTemplate().getForObject(getURL(), ClientChanges.class);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(searchResult);
	}

	@Override
	public ResponseEntity<?> insertClientVoucher(ClientVoucher clientVoucher) throws JmottoAlsException{

		Vouchers savedObject = null;
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
			
			savedObject = getRestTemplate().getForObject(getURL(), Vouchers.class);
			if(null == savedObject.getVouchers().get(0).getVoucher())
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
