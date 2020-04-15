package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement(name = "row")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Voucher {
	
	@XmlAttribute
	private Integer voucher;      
	private Integer blockno;      
	private Integer product;      
	private Integer prodrate;     
	private Integer quantity;     
	private Integer agency;       
	private Integer seq;
	private Integer client;
	private Integer vouchercode;
	private Integer vendorcode;
	private Integer location;
	private Integer refundcount;
	private Integer vendororproductinactive;
	private Integer controlno;
	
	private String actdate;       
	private String clientname;    
	private String agencyname;    
	private String productname;   
	private String prodratename;  
	private String locationname;  
	private String issuedate;     
	private String issueddate;     
	private String issuedtime;     
	private String issueddesk;     
	private String phone; 
	private String cellphone; 
	private String hotelname; 
	private String agentname; 
	private String acttime; 
	private String checkintime; 
	private String vouchernotes; 
	private String agentnotes; 
	private String vendorconf; 
	private String hotelphone; 
	private String bookedon;
	private String acttimeap;
	private String issueddatetime;
	private String issueddatetimeap;
	private String vendorname;
	private String printednotes;
	private String actdatef;
	private String actdatew;
	private String latlong;
	private String address;
	private String checkintimeap;
	private String email;
	private String notes;
	private String issuedby;
	private String soldbyname;
	private String refundpending;
	private String status;
	private String pickuplocation;
	
	private Float total;          
	private Float tax;            
	private Float vendorrate;     
	private Float grossrate;      
	private Float netrate;
	private Float retailrate;   
	private Float giftdiscount; 
	
	private Boolean issued;
	private Boolean offblock;
	private Boolean canceled;
	private Boolean vendpaid;
	private Boolean webportal;
	private Boolean refunded;
	private Boolean usespickup;
	private Boolean servicechargeoverride;
	
	public Integer getControlno() {
		return controlno;
	}
	public void setControlno(Integer controlno) {
		this.controlno = controlno;
	}
	public Boolean getServicechargeoverride() {
		return servicechargeoverride;
	}
	public void setServicechargeoverride(Boolean servicechargeoverride) {
		this.servicechargeoverride = servicechargeoverride;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getClient() {
		return client;
	}
	public void setClient(Integer client) {
		this.client = client;
	}
	public Boolean getIssued() {
		return issued;
	}
	public void setIssued(Boolean issued) {
		this.issued = issued;
	}
	public Integer getVoucher() {
		return voucher;
	}
	public void setVoucher(Integer voucher) {
		this.voucher = voucher;
	}
	public Integer getBlockno() {
		return blockno;
	}
	public void setBlockno(Integer blockno) {
		this.blockno = blockno;
	}
	public Integer getProduct() {
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
	public Integer getProdrate() {
		return prodrate;
	}
	public void setProdrate(Integer prodrate) {
		this.prodrate = prodrate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getAgency() {
		return agency;
	}
	public void setAgency(Integer agency) {
		this.agency = agency;
	}
	public Float getRetailrate() {
		return retailrate;
	}
	public void setRetailrate(Float retailrate) {
		this.retailrate = retailrate;
	}
	public Float getGiftdiscount() {
		return giftdiscount;
	}
	public void setGiftdiscount(Float giftdiscount) {
		this.giftdiscount = giftdiscount;
	}
	public String getActdate() {
		return actdate;
	}
	public void setActdate(String actdate) {
		this.actdate = actdate;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProdratename() {
		return prodratename;
	}
	public void setProdratename(String prodratename) {
		this.prodratename = prodratename;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Float getTax() {
		return tax;
	}
	public void setTax(Float tax) {
		this.tax = tax;
	}
	public Float getVendorrate() {
		return vendorrate;
	}
	public void setVendorrate(Float vendorrate) {
		this.vendorrate = vendorrate;
	}
	public Float getGrossrate() {
		return grossrate;
	}
	public void setGrossrate(Float grossrate) {
		this.grossrate = grossrate;
	}
	public Float getNetrate() {
		return netrate;
	}
	public void setNetrate(Float netrate) {
		this.netrate = netrate;
	}
	public Integer getVouchercode() {
		return vouchercode;
	}
	public void setVouchercode(Integer vouchercode) {
		this.vouchercode = vouchercode;
	}
	public Integer getVendorcode() {
		return vendorcode;
	}
	public void setVendorcode(Integer vendorcode) {
		this.vendorcode = vendorcode;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Integer getRefundcount() {
		return refundcount;
	}
	public void setRefundcount(Integer refundcount) {
		this.refundcount = refundcount;
	}
	public Integer getVendororproductinactive() {
		return vendororproductinactive;
	}
	public void setVendororproductinactive(Integer vendororproductinactive) {
		this.vendororproductinactive = vendororproductinactive;
	}
	public String getIssueddate() {
		return issueddate;
	}
	public void setIssueddate(String issueddate) {
		this.issueddate = issueddate;
	}
	public String getIssuedtime() {
		return issuedtime;
	}
	public void setIssuedtime(String issuedtime) {
		this.issuedtime = issuedtime;
	}
	public String getIssueddesk() {
		return issueddesk;
	}
	public void setIssueddesk(String issueddesk) {
		this.issueddesk = issueddesk;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getAgentname() {
		return agentname;
	}
	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}
	public String getActtime() {
		return acttime;
	}
	public void setActtime(String acttime) {
		this.acttime = acttime;
	}
	public String getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}
	public String getVouchernotes() {
		return vouchernotes;
	}
	public void setVouchernotes(String vouchernotes) {
		this.vouchernotes = vouchernotes;
	}
	public String getAgentnotes() {
		return agentnotes;
	}
	public void setAgentnotes(String agentnotes) {
		this.agentnotes = agentnotes;
	}
	public String getVendorconf() {
		return vendorconf;
	}
	public void setVendorconf(String vendorconf) {
		this.vendorconf = vendorconf;
	}
	public String getHotelphone() {
		return hotelphone;
	}
	public void setHotelphone(String hotelphone) {
		this.hotelphone = hotelphone;
	}
	public String getBookedon() {
		return bookedon;
	}
	public void setBookedon(String bookedon) {
		this.bookedon = bookedon;
	}
	public String getActtimeap() {
		return acttimeap;
	}
	public void setActtimeap(String acttimeap) {
		this.acttimeap = acttimeap;
	}
	public String getIssueddatetime() {
		return issueddatetime;
	}
	public void setIssueddatetime(String issueddatetime) {
		this.issueddatetime = issueddatetime;
	}
	public String getIssueddatetimeap() {
		return issueddatetimeap;
	}
	public void setIssueddatetimeap(String issueddatetimeap) {
		this.issueddatetimeap = issueddatetimeap;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getPrintednotes() {
		return printednotes;
	}
	public void setPrintednotes(String printednotes) {
		this.printednotes = printednotes;
	}
	public String getActdatef() {
		return actdatef;
	}
	public void setActdatef(String actdatef) {
		this.actdatef = actdatef;
	}
	public String getActdatew() {
		return actdatew;
	}
	public void setActdatew(String actdatew) {
		this.actdatew = actdatew;
	}
	public String getLatlong() {
		return latlong;
	}
	public void setLatlong(String latlong) {
		this.latlong = latlong;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCheckintimeap() {
		return checkintimeap;
	}
	public void setCheckintimeap(String checkintimeap) {
		this.checkintimeap = checkintimeap;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getIssuedby() {
		return issuedby;
	}
	public void setIssuedby(String issuedby) {
		this.issuedby = issuedby;
	}
	public String getSoldbyname() {
		return soldbyname;
	}
	public void setSoldbyname(String soldbyname) {
		this.soldbyname = soldbyname;
	}
	public String getRefundpending() {
		return refundpending;
	}
	public void setRefundpending(String refundpending) {
		this.refundpending = refundpending;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPickuplocation() {
		return pickuplocation;
	}
	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}
	public Boolean getOffblock() {
		return offblock;
	}
	public void setOffblock(Boolean offblock) {
		this.offblock = offblock;
	}
	public Boolean getCanceled() {
		return canceled;
	}
	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	public Boolean getVendpaid() {
		return vendpaid;
	}
	public void setVendpaid(Boolean vendpaid) {
		this.vendpaid = vendpaid;
	}
	public Boolean getWebportal() {
		return webportal;
	}
	public void setWebportal(Boolean webportal) {
		this.webportal = webportal;
	}
	public Boolean getRefunded() {
		return refunded;
	}
	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}
	public Boolean getUsespickup() {
		return usespickup;
	}
	public void setUsespickup(Boolean usespickup) {
		this.usespickup = usespickup;
	}
	@Override
	public String toString() {
		return "Voucher [voucher=" + voucher + ", blockno=" + blockno + ", product=" + product + ", prodrate="
				+ prodrate + ", quantity=" + quantity + ", agency=" + agency + ", seq=" + seq + ", client=" + client
				+ ", vouchercode=" + vouchercode + ", vendorcode=" + vendorcode + ", location=" + location
				+ ", refundcount=" + refundcount + ", vendororproductinactive=" + vendororproductinactive
				+ ", controlno=" + controlno + ", actdate=" + actdate + ", clientname=" + clientname + ", agencyname="
				+ agencyname + ", productname=" + productname + ", prodratename=" + prodratename + ", locationname="
				+ locationname + ", issuedate=" + issuedate + ", issueddate=" + issueddate + ", issuedtime="
				+ issuedtime + ", issueddesk=" + issueddesk + ", phone=" + phone + ", cellphone=" + cellphone
				+ ", hotelname=" + hotelname + ", agentname=" + agentname + ", acttime=" + acttime + ", checkintime="
				+ checkintime + ", vouchernotes=" + vouchernotes + ", agentnotes=" + agentnotes + ", vendorconf="
				+ vendorconf + ", hotelphone=" + hotelphone + ", bookedon=" + bookedon + ", acttimeap=" + acttimeap
				+ ", issueddatetime=" + issueddatetime + ", issueddatetimeap=" + issueddatetimeap + ", vendorname="
				+ vendorname + ", printednotes=" + printednotes + ", actdatef=" + actdatef + ", actdatew=" + actdatew
				+ ", latlong=" + latlong + ", address=" + address + ", checkintimeap=" + checkintimeap + ", email="
				+ email + ", notes=" + notes + ", issuedby=" + issuedby + ", soldbyname=" + soldbyname
				+ ", refundpending=" + refundpending + ", status=" + status + ", pickuplocation=" + pickuplocation
				+ ", total=" + total + ", tax=" + tax + ", vendorrate=" + vendorrate + ", grossrate=" + grossrate
				+ ", netrate=" + netrate + ", retailrate=" + retailrate + ", giftdiscount=" + giftdiscount + ", issued="
				+ issued + ", offblock=" + offblock + ", canceled=" + canceled + ", vendpaid=" + vendpaid
				+ ", webportal=" + webportal + ", refunded=" + refunded + ", usespickup=" + usespickup
				+ ", servicechargeoverride=" + servicechargeoverride + "]";
	}
	
}