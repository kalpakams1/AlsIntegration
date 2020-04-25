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
public class NameSpaces {
	
	
	@XmlElementWrapper(name="siteName")
    @XmlElement(name="row")
	private List<NameSpace> siteName;
	
	@XmlElementWrapper(name="mainPageParagraphs")
    @XmlElement(name="row")
	private List<NameSpace> mainPageParagraphs;
	
	@XmlElementWrapper(name="top_ten")
    @XmlElement(name="row")
	private List<NameSpace> top_ten;

	public List<NameSpace> getSiteName() {
		return siteName;
	}

	public void setSiteName(List<NameSpace> siteName) {
		this.siteName = siteName;
	}

	public List<NameSpace> getMainPageParagraphs() {
		return mainPageParagraphs;
	}

	public void setMainPageParagraphs(List<NameSpace> mainPageParagraphs) {
		this.mainPageParagraphs = mainPageParagraphs;
	}

	public List<NameSpace> getTop_ten() {
		return top_ten;
	}

	public void setTop_ten(List<NameSpace> top_ten) {
		this.top_ten = top_ten;
	}

}