package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Clients {
	
	@XmlElementWrapper(name="client")
	private List<Client> client;

	@XmlElementWrapper(name="webclient")
	private List<WebClient> webclient;
	
	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	public List<WebClient> getWebclient() {
		return webclient;
	}

	public void setWebclient(List<WebClient> webclient) {
		this.webclient = webclient;
	}
	
	
}