package com.baba.tutorial.hibernate.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "ADDRESS_LINE_1")
	public String addressLine1;

	@Column(name = "ADDRESS_LINE_2")
	public String addressLine2;

	@Column(name = "CITY")
	public String city;

	@Column(name = "STATE")
	public String state;

	@Column(name = "ZIP_CODE")
	public String zipCode;

	public Address() {
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
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

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}