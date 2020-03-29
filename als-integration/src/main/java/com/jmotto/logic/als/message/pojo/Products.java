package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Products {
	
	@XmlAttribute
	private Integer code;
	
	private Integer vendor;
	
	private Integer category;
	
	private Integer location;
	
	private String vendorname;
	
	private String locationname;
	
	private String productname;
	
	private String description;
	
	private String webjpglocation;
	
	private String vouchernotes;
	
	private String categoryname;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getVendor() {
		return vendor;
	}

	public void setVendor(Integer vendor) {
		this.vendor = vendor;
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

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebjpglocation() {
		return webjpglocation;
	}

	public void setWebjpglocation(String webjpglocation) {
		this.webjpglocation = webjpglocation;
	}

	public String getVouchernotes() {
		return vouchernotes;
	}

	public void setVouchernotes(String vouchernotes) {
		this.vouchernotes = vouchernotes;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
}