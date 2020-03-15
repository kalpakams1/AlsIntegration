package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clients {
	
	@XmlElementWrapper(name="client")
    @XmlElement(name="row")
	private List<Client> client;

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}
}