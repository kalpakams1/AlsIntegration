package com.jmotto.logic.als.message.pojo;

import java.util.Map;

public class ClientVoucher {
	
	/*Code from required for insert access*/
	private Integer webusercode;      
	
	/*Code of the Client*/
	private Integer client; 
	
	/*Date of the activity*/
	private String activitydate;     
	
	/*Time of the activity*/
	private String activitytime;    
	
	/*Free Text field*/
	private String notes;    
	
	/*Defines whether this voucher will be used in block availability computations*/
	private boolean block;
	
	/*Number of Rates*/
	private Integer count;  
	
	/*Map<PricingCode, Quantity> Value representing the pricing code for this rate. A quantity of the pricing code.*/
	private Map<Integer, Integer> pricingcodeMap;  

	/*The voucher will be marked as NOT issued and no automatic call to als_insert_payment.cgi will be invoked.*/
	private boolean custompayment;          
	
	/* Each Voucher can have an agency tied to it when it is created. 
	 * The Agency as defined in the AL-Desk Web Interface Users will be used as the default agency.*/
	private Integer agency;
	
	/* Allows a voucher to be created but no issued. Cannot be used with credit card or custom payment parameters 
     * since there is no payment of an un-issued voucher.*/
	private boolean unissued;

	public Integer getWebusercode() {
		return webusercode;
	}

	public void setWebusercode(Integer webusercode) {
		this.webusercode = webusercode;
	}

	public Integer getClient() {
		return client;
	}

	public void setClient(Integer client) {
		this.client = client;
	}

	public String getActivitydate() {
		return activitydate;
	}

	public void setActivitydate(String activitydate) {
		this.activitydate = activitydate;
	}

	public String getActivitytime() {
		return activitytime;
	}

	public void setActivitytime(String activitytime) {
		this.activitytime = activitytime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean getBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public boolean getCustompayment() {
		return custompayment;
	}

	public void setCustompayment(boolean custompayment) {
		this.custompayment = custompayment;
	}

	
	public boolean getUnissued() {
		return unissued;
	}

	public void setUnissued(boolean unissued) {
		this.unissued = unissued;
	}

	public Map<Integer, Integer> getPricingcodeMap() {
		return pricingcodeMap;
	}

	public void setPricingcodeMap(Map<Integer, Integer> pricingcodeMap) {
		this.pricingcodeMap = pricingcodeMap;
	}

	public Integer getAgency() {
		return agency;
	}

	public void setAgency(Integer agency) {
		this.agency = agency;
	}

	@Override
	public String toString() {
		return "ClientVoucher [webusercode=" + webusercode + ", client=" + client + ", activitydate=" + activitydate
				+ ", activitytime=" + activitytime + ", notes=" + notes + ", block=" + block + ", count=" + count
				+ ", pricingcodeMap=" + pricingcodeMap + ", custompayment=" + custompayment + ", Agency=" + agency
				+ ", unissued=" + unissued + "]";
	}

	
}