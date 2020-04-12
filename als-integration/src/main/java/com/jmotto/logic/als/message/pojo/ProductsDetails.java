package com.jmotto.logic.als.message.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductsDetails {
	
	@XmlElementWrapper(name="categories")
    @XmlElement(name="row")
	private List<Category> categories;
	
	@XmlElementWrapper(name="products")
    @XmlElement(name="row")
	private List<Products> products;
	
	@XmlElementWrapper(name="vendors")
    @XmlElement(name="row")
	private List<Vendors> vendors;

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<Vendors> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendors> vendors) {
		this.vendors = vendors;
	}
	
}