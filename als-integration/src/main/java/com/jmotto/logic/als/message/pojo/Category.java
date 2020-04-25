package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Kalpaka
 *
 */
@XmlRootElement(name = "row")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Category {
	
	@XmlAttribute
	private String code;
	
	private String name;
	
	private String categorygroup;
	
	private String categorygroupname;
	
	private String description;

	private String imagepath;
	
	private Integer locationcode;
	
	private String locationname;
	
	private String wp_sort;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public Integer getLocationcode() {
		return locationcode;
	}

	public void setLocationcode(Integer locationcode) {
		this.locationcode = locationcode;
	}

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public String getWp_sort() {
		return wp_sort;
	}

	public void setWp_sort(String wp_sort) {
		this.wp_sort = wp_sort;
	}

	@Override
	public String toString() {
		return "Category [code=" + code + ", name=" + name + ", categorygroup=" + categorygroup + ", categorygroupname="
				+ categorygroupname + ", description=" + description + ", imagepath=" + imagepath + ", locationcode="
				+ locationcode + ", locationname=" + locationname + ", wp_sort=" + wp_sort + "]";
	}

}