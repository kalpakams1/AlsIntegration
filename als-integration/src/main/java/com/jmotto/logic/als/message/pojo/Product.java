package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Product {
	
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

	private String descript;
	
	private String strikethrutext;
	
	private String shortdescription;
	
	private String productspecial;
	
	private String agentnotes;
	
	private String web_blackouttext;
	
	private String name;
	
	private String popular;
	
	private String producttime;
	
	private String dowavail;
	
	private String nobookingsafter;
	
	private String imageurlx;
	
	private Integer maxbook_qty;
	
	private Integer website_bookdays;
	
	private Integer categorygroup;
	
	private String categorygroupname;
	
	private String aln_product;
	
	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getStrikethrutext() {
		return strikethrutext;
	}

	public void setStrikethrutext(String strikethrutext) {
		this.strikethrutext = strikethrutext;
	}

	public String getShortdescription() {
		return shortdescription;
	}

	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}

	public String getProductspecial() {
		return productspecial;
	}

	public void setProductspecial(String productspecial) {
		this.productspecial = productspecial;
	}

	public String getAgentnotes() {
		return agentnotes;
	}

	public void setAgentnotes(String agentnotes) {
		this.agentnotes = agentnotes;
	}

	public String getWeb_blackouttext() {
		return web_blackouttext;
	}

	public void setWeb_blackouttext(String web_blackouttext) {
		this.web_blackouttext = web_blackouttext;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopular() {
		return popular;
	}

	public void setPopular(String popular) {
		this.popular = popular;
	}

	public String getProducttime() {
		return producttime;
	}

	public void setProducttime(String producttime) {
		this.producttime = producttime;
	}

	public String getDowavail() {
		return dowavail;
	}

	public void setDowavail(String dowavail) {
		this.dowavail = dowavail;
	}

	public String getNobookingsafter() {
		return nobookingsafter;
	}

	public void setNobookingsafter(String nobookingsafter) {
		this.nobookingsafter = nobookingsafter;
	}

	public String getImageurlx() {
		return imageurlx;
	}

	public void setImageurlx(String imageurlx) {
		this.imageurlx = imageurlx;
	}

	public Integer getMaxbook_qty() {
		return maxbook_qty;
	}

	public void setMaxbook_qty(Integer maxbook_qty) {
		this.maxbook_qty = maxbook_qty;
	}

	public Integer getWebsite_bookdays() {
		return website_bookdays;
	}

	public void setWebsite_bookdays(Integer website_bookdays) {
		this.website_bookdays = website_bookdays;
	}

	public Integer getCategorygroup() {
		return categorygroup;
	}

	public void setCategorygroup(Integer categorygroup) {
		this.categorygroup = categorygroup;
	}

	public String getCategorygroupname() {
		return categorygroupname;
	}

	public void setCategorygroupname(String categorygroupname) {
		this.categorygroupname = categorygroupname;
	}

	public String getAln_product() {
		return aln_product;
	}

	public void setAln_product(String aln_product) {
		this.aln_product = aln_product;
	}

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

	@Override
	public String toString() {
		return "Products [code=" + code + ", vendor=" + vendor + ", category=" + category + ", location=" + location
				+ ", vendorname=" + vendorname + ", locationname=" + locationname + ", productname=" + productname
				+ ", description=" + description + ", webjpglocation=" + webjpglocation + ", vouchernotes="
				+ vouchernotes + ", categoryname=" + categoryname + ", descript=" + descript + ", strikethrutext="
				+ strikethrutext + ", shortdescription=" + shortdescription + ", productspecial=" + productspecial
				+ ", agentnotes=" + agentnotes + ", web_blackouttext=" + web_blackouttext + ", name=" + name
				+ ", popular=" + popular + ", producttime=" + producttime + ", dowavail=" + dowavail
				+ ", nobookingsafter=" + nobookingsafter + ", imageurlx=" + imageurlx + ", maxbook_qty=" + maxbook_qty
				+ ", website_bookdays=" + website_bookdays + ", categorygroup=" + categorygroup + ", categorygroupname="
				+ categorygroupname + ", aln_product=" + aln_product + "]";
	}
	
	
}