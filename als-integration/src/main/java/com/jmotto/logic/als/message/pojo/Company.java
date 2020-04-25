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
public class Company {
	
	@XmlAttribute
	private String name;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String zip;

	private String fax;
	
	private String phone;
	
	private String email;
	
	private String downloadpages;
	
	private String support_email;
	
	private String directions;
	
	private String yetanothername;
	
	private String webexample;
	
	private String newproductentry;
	
	private String main;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDownloadpages() {
		return downloadpages;
	}

	public void setDownloadpages(String downloadpages) {
		this.downloadpages = downloadpages;
	}

	public String getSupport_email() {
		return support_email;
	}

	public void setSupport_email(String support_email) {
		this.support_email = support_email;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getYetanothername() {
		return yetanothername;
	}

	public void setYetanothername(String yetanothername) {
		this.yetanothername = yetanothername;
	}

	public String getWebexample() {
		return webexample;
	}

	public void setWebexample(String webexample) {
		this.webexample = webexample;
	}

	public String getNewproductentry() {
		return newproductentry;
	}

	public void setNewproductentry(String newproductentry) {
		this.newproductentry = newproductentry;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", fax=" + fax + ", phone=" + phone + ", email=" + email
				+ ", downloadpages=" + downloadpages + ", support_email=" + support_email + ", directions=" + directions
				+ ", yetanothername=" + yetanothername + ", webexample=" + webexample + ", newproductentry="
				+ newproductentry + ", main=" + main + "]";
	}
	
}