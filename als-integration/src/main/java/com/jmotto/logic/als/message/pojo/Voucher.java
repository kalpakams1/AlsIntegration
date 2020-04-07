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
	private Integer retailrate;   
	private Integer giftdiscount; 
	private Integer seq;
	private Integer client;
	
	private String actdate;       
	private String clientname;    
	private String agencyname;    
	private String productname;   
	private String prodratename;  
	private String locationname;  
	private String issuedate;     
	 
	private Float total;          
	private Float tax;            
	private Float vendorrate;     
	private Float grossrate;      
	private Float netrate;
	
	private Boolean issued;
	
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
	public Integer getRetailrate() {
		return retailrate;
	}
	public void setRetailrate(Integer retailrate) {
		this.retailrate = retailrate;
	}
	public Integer getGiftdiscount() {
		return giftdiscount;
	}
	public void setGiftdiscount(Integer giftdiscount) {
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
	@Override
	public String toString() {
		return "Voucher [voucher=" + voucher + ", blockno=" + blockno + ", product=" + product + ", prodrate="
				+ prodrate + ", quantity=" + quantity + ", agency=" + agency + ", retailrate=" + retailrate
				+ ", giftdiscount=" + giftdiscount + ", seq=" + seq + ", client=" + client + ", actdate=" + actdate
				+ ", clientname=" + clientname + ", agencyname=" + agencyname + ", productname=" + productname
				+ ", prodratename=" + prodratename + ", locationname=" + locationname + ", issuedate=" + issuedate
				+ ", total=" + total + ", tax=" + tax + ", vendorrate=" + vendorrate + ", grossrate=" + grossrate
				+ ", netrate=" + netrate + ", issued=" + issued + "]";
	}        

}