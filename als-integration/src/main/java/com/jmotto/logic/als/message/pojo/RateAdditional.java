package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class RateAdditional {
	
	@XmlAttribute
	private Integer code;
	
	private String name;
	
	private String exType;
	
	private Boolean exRequired;

	private String bySeat;
	
	private String productRateName;
	
	private String prodRate;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExType() {
		return exType;
	}

	public void setExType(String exType) {
		this.exType = exType;
	}

	public Boolean getExRequired() {
		return exRequired;
	}

	public void setExRequired(Boolean exRequired) {
		this.exRequired = exRequired;
	}

	public String getBySeat() {
		return bySeat;
	}

	public void setBySeat(String bySeat) {
		this.bySeat = bySeat;
	}

	public String getProductRateName() {
		return productRateName;
	}

	public void setProductRateName(String productRateName) {
		this.productRateName = productRateName;
	}

	public String getProdRate() {
		return prodRate;
	}

	public void setProdRate(String prodRate) {
		this.prodRate = prodRate;
	}
	
	
}