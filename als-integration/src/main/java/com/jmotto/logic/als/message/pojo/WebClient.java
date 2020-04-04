package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "row")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class WebClient {
	
	@XmlAttribute
	private Integer webclient;  
	private String firstname; 
	private String lastname; 
	private String email; 
	private String username;
	private String password;
	private String address1; 
	private String address2; 
	private String city; 
	private String state; 
	private String zip;
	private String country;
	private Integer cellphone; 
	private String phone; 
	private String fax; 
	private String notes; 
	private String websession; 
	private String dateadded; 
	private String lastupdated; 
	private Boolean active; 
	private String agency; 
	private String cmsadmin;
	private String usercode;
	private Boolean anonymous;
	private String agent;
	private Boolean forcepasswordchange;
	public Integer getWebclient() {
		return webclient;
	}
	public void setWebclient(Integer webclient) {
		this.webclient = webclient;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getCellphone() {
		return cellphone;
	}
	public void setCellphone(Integer cellphone) {
		this.cellphone = cellphone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getWebsession() {
		return websession;
	}
	public void setWebsession(String websession) {
		this.websession = websession;
	}
	public String getDateadded() {
		return dateadded;
	}
	public void setDateadded(String dateadded) {
		this.dateadded = dateadded;
	}
	public String getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getCmsadmin() {
		return cmsadmin;
	}
	public void setCmsadmin(String cmsadmin) {
		this.cmsadmin = cmsadmin;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public Boolean getAnonymous() {
		return anonymous;
	}
	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public Boolean getForcepasswordchange() {
		return forcepasswordchange;
	}
	public void setForcepasswordchange(Boolean forcepasswordchange) {
		this.forcepasswordchange = forcepasswordchange;
	}
	@Override
	public String toString() {
		return "WebClient [webclient=" + webclient + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", username=" + username + ", password=" + password + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ ", cellphone=" + cellphone + ", phone=" + phone + ", fax=" + fax + ", notes=" + notes
				+ ", websession=" + websession + ", dateadded=" + dateadded + ", lastupdated=" + lastupdated
				+ ", active=" + active + ", agency=" + agency + ", cmsadmin=" + cmsadmin + ", usercode=" + usercode
				+ ", anonymous=" + anonymous + ", agent=" + agent + ", forcepasswordchange=" + forcepasswordchange
				+ "]";
	}
	
}