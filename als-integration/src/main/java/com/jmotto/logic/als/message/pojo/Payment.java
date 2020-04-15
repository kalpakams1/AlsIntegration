package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Payment {

	@XmlAttribute       
	private String referencevalue;              
	private String timevalue;            
	private String datevalue;            

	private Integer seq;   
	private Integer controlno;     
	private Integer paytype;     
	private Integer issuedby;   
	private Integer issueddesk;     
	private Integer client;             

	private Float amount;

	public String getReferencevalue() {
		return referencevalue;
	}

	public void setReferencevalue(String referencevalue) {
		this.referencevalue = referencevalue;
	}

	public String getTimevalue() {
		return timevalue;
	}

	public void setTimevalue(String timevalue) {
		this.timevalue = timevalue;
	}

	public String getDatevalue() {
		return datevalue;
	}

	public void setDatevalue(String datevalue) {
		this.datevalue = datevalue;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getControlno() {
		return controlno;
	}

	public void setControlno(Integer controlno) {
		this.controlno = controlno;
	}

	public Integer getPaytype() {
		return paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}

	public Integer getIssuedby() {
		return issuedby;
	}

	public void setIssuedby(Integer issuedby) {
		this.issuedby = issuedby;
	}

	public Integer getIssueddesk() {
		return issueddesk;
	}

	public void setIssueddesk(Integer issueddesk) {
		this.issueddesk = issueddesk;
	}

	public Integer getClient() {
		return client;
	}

	public void setClient(Integer client) {
		this.client = client;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [referencevalue=" + referencevalue + ", timevalue=" + timevalue + ", datevalue=" + datevalue
				+ ", seq=" + seq + ", controlno=" + controlno + ", paytype=" + paytype + ", issuedby=" + issuedby
				+ ", issueddesk=" + issueddesk + ", client=" + client + ", amount=" + amount + "]";
	}           
             
}
