package com.jmotto.logic.als.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmotto.logic.als.exception.JmottoAlsException;
import com.jmotto.logic.als.message.pojo.ClientVoucher;
import com.jmotto.logic.als.service.AlsVoucherService;
import com.jmotto.logic.als.util.LogThat;

@RestController
@RequestMapping("/api/2.6/als")
@CrossOrigin
public class AlsVoucherController {

	static Logger log = Logger.getLogger(AlsVoucherController.class.getName());
	
	@Autowired
	AlsVoucherService service;
	
	/**
	 * Vouchers can be identified by either the primary key (seq) or by using the client:Integer identifier along with the voucher number. 
	 * When editing a voucher with AL-Desk, the Client Identifier along with a voucher number that is unique for that client is used.
	 * @param seq, voucher, client, issued	
	 * @return Vouchers
	 */
	@GetMapping(value = "/vouchers", produces = "application/json")
	@LogThat
	public ResponseEntity<?> getVouchers(@RequestParam(required = false) Integer seq, 
			@RequestParam(required = false) Integer voucher, @RequestParam(required = false) Integer client,
			@RequestParam(required = false) boolean issued) throws JmottoAlsException
	{	
		return service.getVouchers(seq, voucher, client, issued);
	}
	/**
	 * The als_insert_voucher.cgi interface inserts a new voucher just like if a
	 * user was entering a voucher using the AL-Desk client. There is quite a bit of
	 * data validation contained in the als_insert_voucher.cgi call in order to make
	 * sure that only clean data is processed and accepted by AL-Desk. Voucher
	 * Numbering :- AL-Desk numbers the vouchers using the Client Code along with a
	 * voucher number that is incremented for each client for each new voucher. Thus
	 * a customer with number 103205 would have her first voucher numbered as
	 * 103205-1 and subsequent vouchers would be numbered as 103205-NN where NN is
	 * an incremental counter.
	 * 
	 * @param Voucher
	 * @return
	 */
	@PutMapping(value = "/insertvoucher", produces = "application/json") 
	@LogThat
	public ResponseEntity<?> insertVoucher(@RequestBody(required = true) ClientVoucher
		  clientVoucher) throws JmottoAlsException {
		  
		  return  service.insertVoucher(clientVoucher); 
		  }
}
