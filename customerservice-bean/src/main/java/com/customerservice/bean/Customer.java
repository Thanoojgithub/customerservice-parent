package com.customerservice.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private Integer Id;
	private String name;
	private String location;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", address="
				+ location + "]";
	}

}
