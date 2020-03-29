package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateAdditionals {
	
	@XmlElementWrapper(name="rates")
    @XmlElement(name="row")
	private List<RateAdditional> rates;

	public List<RateAdditional> getRates() {
		return rates;
	}

	public void setRates(List<RateAdditional> rates) {
		this.rates = rates;
	}
}