package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "row")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Vendor {
	
	@XmlAttribute
	private Integer code;
	
	private Integer category;
	
	private Integer location;
	
	private String name;
	
	private String locationname;
	
	private String categoryname;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Vendors [code=" + code + ", category=" + category + ", location=" + location + ", name=" + name
				+ ", locationname=" + locationname + ", categoryname=" + categoryname + "]";
	}
	
}