package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Transactiontypes {
	
	@XmlElementWrapper(name="transactiontypes")
    @XmlElement(name="row")
	private List<Transactiontype> transactiontypes;

	public List<Transactiontype> getTransactiontypes() {
		return transactiontypes;
	}

	public void setTransactiontypes(List<Transactiontype> transactiontypes) {
		this.transactiontypes = transactiontypes;
	}
}