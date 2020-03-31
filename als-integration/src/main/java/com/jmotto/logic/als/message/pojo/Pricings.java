package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pricings {
	
	@XmlElementWrapper(name="pricing")
    @XmlElement(name="row")
	private List<Pricing> pricing;

	public List<Pricing> getPricing() {
		return pricing;
	}

	public void setPricing(List<Pricing> pricing) {
		this.pricing = pricing;
	}
}