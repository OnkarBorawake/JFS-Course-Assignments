package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="telephone")
public class Telephone {
	@Id
	@Column(name="telephone_id")
	private String telephoneId;
	
	@Column(name="telephone_number")
	private long telephoneNumber;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name="customer_id")
	private String customerId;

	public Telephone() {}

	public Telephone(String telephoneId, long telephoneNumber, long mobileNumber, String customerId) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.customerId = customerId;
	}

	public String getTelephoneId() {
		return telephoneId;
	}

	public void setTelephoneId(String telephoneId) {
		this.telephoneId = telephoneId;
	}

	public long getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + ", customerId=" + customerId + "]";
	}

	
	
}
