package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Rate {
	
	@XmlAttribute
	private Integer code;
	
	private Integer product;
	
	private Integer vendor;
	
	private String vendorName;
	
	private String productName;
	
	private String productRateName;
	
	private Boolean seat;

	private Float vendorRate;
	
	private Float category;
	
	private String categoryName;
	
	private Integer location;
	
	private String locationName;

	@XmlElementWrapper(name="products")
    @XmlElement(name="row")
	private List<Products> products;
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public Integer getVendor() {
		return vendor;
	}

	public void setVendor(Integer vendor) {
		this.vendor = vendor;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductRateName() {
		return productRateName;
	}

	public void setProductRateName(String productRateName) {
		this.productRateName = productRateName;
	}

	public Boolean getSeat() {
		return seat;
	}

	public void setSeat(Boolean seat) {
		this.seat = seat;
	}

	public Float getVendorRate() {
		return vendorRate;
	}

	public void setVendorRate(Float vendorRate) {
		this.vendorRate = vendorRate;
	}

	public Float getCategory() {
		return category;
	}

	public void setCategory(Float category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
}