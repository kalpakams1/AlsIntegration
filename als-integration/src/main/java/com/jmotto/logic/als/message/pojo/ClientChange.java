package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class ClientChange {
	
	@XmlAttribute
	private String username;
	
	private String seq;
	
	private String client;
	
	private String voucher;

	private String field;
	
	private String fromvalue;
	
	private String tovalue;
	
	private String usercode;
	
	private String datetime;
	
	private String agent;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFromvalue() {
		return fromvalue;
	}

	public void setFromvalue(String fromvalue) {
		this.fromvalue = fromvalue;
	}

	public String getTovalue() {
		return tovalue;
	}

	public void setTovalue(String tovalue) {
		this.tovalue = tovalue;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}