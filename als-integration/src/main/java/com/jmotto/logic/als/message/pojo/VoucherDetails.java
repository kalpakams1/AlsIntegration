package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VoucherDetails {
	
	@XmlElementWrapper(name="vouchers")
    @XmlElement(name="row")
	private List<Voucher> vouchers;

	@XmlElementWrapper(name="shoppingcart_thankyou")
    @XmlElement(name="row")
	private List<ShoppingCart> shoppingcart_thankyou;
	
	@XmlElementWrapper(name="payments")
    @XmlElement(name="row")
	private List<Payment> payments;

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public List<ShoppingCart> getShoppingcart_thankyou() {
		return shoppingcart_thankyou;
	}

	public void setShoppingcart_thankyou(List<ShoppingCart> shoppingcart_thankyou) {
		this.shoppingcart_thankyou = shoppingcart_thankyou;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	
	
	
}