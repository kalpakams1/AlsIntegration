package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CompanyDetails {
	
	@XmlElementWrapper(name="company")
    @XmlElement(name="row")
	private List<Company> company;
	
	@XmlElementWrapper(name="namespaces")
	private NameSpaces namespaces;

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public NameSpaces getNamespaces() {
		return namespaces;
	}

	public void setNamespaces(NameSpaces namespaces) {
		this.namespaces = namespaces;
	}
	
}