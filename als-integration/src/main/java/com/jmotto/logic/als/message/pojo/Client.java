package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Client {
	
	@XmlAttribute
	private String code; 
	private String name; 
	private String firstname; 
	private String lastname; 
	private String hotel; 
	private String room; 
	private String arrivaldate; 
	private String departuredate; 
	private String homephone; 
	private String notes; 
	private String lastvoucher; 
	private String email; 
	private String faxphone; 
	private String cellphone; 
	private String otherphone; 
	private String workphone; 
	private String hotelname; 
	private String source; 
	private String usercode; 
	private String deskcode; 
	private String deskname; 
	private String sourcename; 
	private String username; 
	private String address1; 
	private String address2; 
	private String city; 
	private String state; 
	private String zip;
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
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getArrivaldate() {
		return arrivaldate;
	}
	public void setArrivaldate(String arrivaldate) {
		this.arrivaldate = arrivaldate;
	}
	public String getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getLastvoucher() {
		return lastvoucher;
	}
	public void setLastvoucher(String lastvoucher) {
		this.lastvoucher = lastvoucher;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFaxphone() {
		return faxphone;
	}
	public void setFaxphone(String faxphone) {
		this.faxphone = faxphone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getOtherphone() {
		return otherphone;
	}
	public void setOtherphone(String otherphone) {
		this.otherphone = otherphone;
	}
	public String getWorkphone() {
		return workphone;
	}
	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getDeskcode() {
		return deskcode;
	}
	public void setDeskcode(String deskcode) {
		this.deskcode = deskcode;
	}
	public String getDeskname() {
		return deskname;
	}
	public void setDeskname(String deskname) {
		this.deskname = deskname;
	}
	public String getSourcename() {
		return sourcename;
	}
	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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

}