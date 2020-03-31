package com.jmotto.logic.als.message.pojo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Pricing {

	@XmlAttribute
	private String productname;          
	private String vendorname;           
	private String ratename;             
	private String giftretention;        
	private String giftingmethod;        
	private String lastupdatedon;        
	private String effectivetourdate;    
	private String affiliateprice;       
	private String effectivedate;        


	private String fixedtax1;            
	private String vartaxrate3;          
	private String vartax3;              
	private String vartaxrate2;          
	private String vartax2;              
	private String fixedtax3;            
	private String fixedtax2;            

	private Integer fixedtaxcommstat2;   
	private Integer vartaxcommstat3;     
	private Integer vartaxcommstat2;     
	private Integer fixedtaxcommstat1;   
	private Integer vartaxcommstat1;     
	private Integer fixedtaxcommstat3;   
	private Integer code;                
	private Integer prodrate;            
	private Integer product;             
	private Integer vendor;              
	private Integer commrate;            

	private Float ratewithtax;           
	private Float commission;            
	private Float netrate;               
	private Float rate;                  
	private Float vartaxrate1;           
	private Float vartax1;               
	private Float wholesaleprice;        
	private Float discountedprice;       
	private Float totaltax;              

	private Boolean active;              
	private Boolean subtoservicecharge;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getRatename() {
		return ratename;
	}
	public void setRatename(String ratename) {
		this.ratename = ratename;
	}
	public String getGiftretention() {
		return giftretention;
	}
	public void setGiftretention(String giftretention) {
		this.giftretention = giftretention;
	}
	public String getGiftingmethod() {
		return giftingmethod;
	}
	public void setGiftingmethod(String giftingmethod) {
		this.giftingmethod = giftingmethod;
	}
	public String getLastupdatedon() {
		return lastupdatedon;
	}
	public void setLastupdatedon(String lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}
	public String getEffectivetourdate() {
		return effectivetourdate;
	}
	public void setEffectivetourdate(String effectivetourdate) {
		this.effectivetourdate = effectivetourdate;
	}
	public String getAffiliateprice() {
		return affiliateprice;
	}
	public void setAffiliateprice(String affiliateprice) {
		this.affiliateprice = affiliateprice;
	}
	public String getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getFixedtax1() {
		return fixedtax1;
	}
	public void setFixedtax1(String fixedtax1) {
		this.fixedtax1 = fixedtax1;
	}
	public String getVartaxrate3() {
		return vartaxrate3;
	}
	public void setVartaxrate3(String vartaxrate3) {
		this.vartaxrate3 = vartaxrate3;
	}
	public String getVartax3() {
		return vartax3;
	}
	public void setVartax3(String vartax3) {
		this.vartax3 = vartax3;
	}
	public String getVartaxrate2() {
		return vartaxrate2;
	}
	public void setVartaxrate2(String vartaxrate2) {
		this.vartaxrate2 = vartaxrate2;
	}
	public String getVartax2() {
		return vartax2;
	}
	public void setVartax2(String vartax2) {
		this.vartax2 = vartax2;
	}
	public String getFixedtax3() {
		return fixedtax3;
	}
	public void setFixedtax3(String fixedtax3) {
		this.fixedtax3 = fixedtax3;
	}
	public String getFixedtax2() {
		return fixedtax2;
	}
	public void setFixedtax2(String fixedtax2) {
		this.fixedtax2 = fixedtax2;
	}
	public Integer getFixedtaxcommstat2() {
		return fixedtaxcommstat2;
	}
	public void setFixedtaxcommstat2(Integer fixedtaxcommstat2) {
		this.fixedtaxcommstat2 = fixedtaxcommstat2;
	}
	public Integer getVartaxcommstat3() {
		return vartaxcommstat3;
	}
	public void setVartaxcommstat3(Integer vartaxcommstat3) {
		this.vartaxcommstat3 = vartaxcommstat3;
	}
	public Integer getVartaxcommstat2() {
		return vartaxcommstat2;
	}
	public void setVartaxcommstat2(Integer vartaxcommstat2) {
		this.vartaxcommstat2 = vartaxcommstat2;
	}
	public Integer getFixedtaxcommstat1() {
		return fixedtaxcommstat1;
	}
	public void setFixedtaxcommstat1(Integer fixedtaxcommstat1) {
		this.fixedtaxcommstat1 = fixedtaxcommstat1;
	}
	public Integer getVartaxcommstat1() {
		return vartaxcommstat1;
	}
	public void setVartaxcommstat1(Integer vartaxcommstat1) {
		this.vartaxcommstat1 = vartaxcommstat1;
	}
	public Integer getFixedtaxcommstat3() {
		return fixedtaxcommstat3;
	}
	public void setFixedtaxcommstat3(Integer fixedtaxcommstat3) {
		this.fixedtaxcommstat3 = fixedtaxcommstat3;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getProdrate() {
		return prodrate;
	}
	public void setProdrate(Integer prodrate) {
		this.prodrate = prodrate;
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
	public Integer getCommrate() {
		return commrate;
	}
	public void setCommrate(Integer commrate) {
		this.commrate = commrate;
	}
	public Float getRatewithtax() {
		return ratewithtax;
	}
	public void setRatewithtax(Float ratewithtax) {
		this.ratewithtax = ratewithtax;
	}
	public Float getCommission() {
		return commission;
	}
	public void setCommission(Float commission) {
		this.commission = commission;
	}
	public Float getNetrate() {
		return netrate;
	}
	public void setNetrate(Float netrate) {
		this.netrate = netrate;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getVartaxrate1() {
		return vartaxrate1;
	}
	public void setVartaxrate1(Float vartaxrate1) {
		this.vartaxrate1 = vartaxrate1;
	}
	public Float getVartax1() {
		return vartax1;
	}
	public void setVartax1(Float vartax1) {
		this.vartax1 = vartax1;
	}
	public Float getWholesaleprice() {
		return wholesaleprice;
	}
	public void setWholesaleprice(Float wholesaleprice) {
		this.wholesaleprice = wholesaleprice;
	}
	public Float getDiscountedprice() {
		return discountedprice;
	}
	public void setDiscountedprice(Float discountedprice) {
		this.discountedprice = discountedprice;
	}
	public Float getTotaltax() {
		return totaltax;
	}
	public void setTotaltax(Float totaltax) {
		this.totaltax = totaltax;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getSubtoservicecharge() {
		return subtoservicecharge;
	}
	public void setSubtoservicecharge(Boolean subtoservicecharge) {
		this.subtoservicecharge = subtoservicecharge;
	}  

}
