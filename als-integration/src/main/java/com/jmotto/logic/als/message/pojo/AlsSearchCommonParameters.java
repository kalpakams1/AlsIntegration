package com.jmotto.logic.als.message.pojo;

public class AlsSearchCommonParameters {

	private Integer location;
	private Integer category;
	private Integer vendor;
	private Integer product;
	private Integer	categorygroup;
	
	private boolean includedesc;
	private boolean content;
	private boolean nodefaultcontent;
	private boolean	inactive;
	
	private String	productsearch; 
	private String	descriptionsearch;
	private String	contentname;
	
	
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getVendor() {
		return vendor;
	}
	public void setVendor(Integer vendor) {
		this.vendor = vendor;
	}
	public Integer getProduct() {
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
	public boolean getIncludedesc() {
		return includedesc;
	}
	public void setIncludedesc(boolean includedesc) {
		this.includedesc = includedesc;
	}
	public boolean getContent() {
		return content;
	}
	public void setContent(boolean content) {
		this.content = content;
	}
	public boolean getNodefaultcontent() {
		return nodefaultcontent;
	}
	public void setNodefaultcontent(boolean nodefaultcontent) {
		this.nodefaultcontent = nodefaultcontent;
	}
	public String getProductsearch() {
		return productsearch;
	}
	public void setProductsearch(String productsearch) {
		this.productsearch = productsearch;
	}
	public String getDescriptionsearch() {
		return descriptionsearch;
	}
	public void setDescriptionsearch(String descriptionsearch) {
		this.descriptionsearch = descriptionsearch;
	}
	public Integer getCategorygroup() {
		return categorygroup;
	}
	public void setCategorygroup(Integer categorygroup) {
		this.categorygroup = categorygroup;
	}
	public String getContentname() {
		return contentname;
	}
	public void setContentname(String contentname) {
		this.contentname = contentname;
	}
	public boolean getInactive() {
		return inactive;
	}
	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}
	@Override
	public String toString() {
		return "AlsSearchCommonParameters [location=" + location + ", category=" + category + ", vendor=" + vendor
				+ ", product=" + product + ", includedesc=" + includedesc + ", content=" + content
				+ ", nodefaultcontent=" + nodefaultcontent + ", productsearch=" + productsearch + ", descriptionsearch="
				+ descriptionsearch + ", categorygroup=" + categorygroup + ", contentname=" + contentname
				+ ", inactive=" + inactive + "]";
	} 
	
	
}
