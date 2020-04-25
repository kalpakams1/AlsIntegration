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
public class CategoryGroups {
	
	@XmlElementWrapper(name="categorygroups")
    @XmlElement(name="row")
	private List<Category> categorygroups;

	public List<Category> getCategorygroups() {
		return categorygroups;
	}

	public void setCategorygroups(List<Category> categorygroups) {
		this.categorygroups = categorygroups;
	}
}