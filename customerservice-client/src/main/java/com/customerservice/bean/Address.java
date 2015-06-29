package com.customerservice.bean;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Address {
	
	private Integer dNo;
	private String street;
	private String area;
	private String city;
	private Integer postalCode;
	
	public Integer getdNo() {
		return dNo;
	}
	public void setdNo(Integer dNo) {
		this.dNo = dNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [dNo=" + dNo + ", street=" + street + ", area=" + area
				+ ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	
}
