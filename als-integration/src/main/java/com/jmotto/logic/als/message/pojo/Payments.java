package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payments {
	
	@XmlElementWrapper(name="payments")
    @XmlElement(name="row")
	private List<Pricing> payments;

	public List<Pricing> getPayments() {
		return payments;
	}

	public void setPayments(List<Pricing> payments) {
		this.payments = payments;
	}
}