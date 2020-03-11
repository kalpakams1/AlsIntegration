package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Category {
	
	@XmlAttribute
	private String code;
	
	private String name;
	
	private String categorygroup;
	
	private String categorygroupname;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategorygroup() {
		return categorygroup;
	}

	public void setCategorygroup(String categorygroup) {
		this.categorygroup = categorygroup;
	}

	public String getCategorygroupname() {
		return categorygroupname;
	}

	public void setCategorygroupname(String categorygroupname) {
		this.categorygroupname = categorygroupname;
	}

	
}