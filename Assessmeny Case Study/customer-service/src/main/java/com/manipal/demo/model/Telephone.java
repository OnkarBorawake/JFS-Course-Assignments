package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telephone {
	
	@Column(name="telephone_id")
	private String telephoneId;
	
	@Column(name="telephone_number")
	private long telephoneNumber;
	
	@Column(name="mobile_number")
	private long mobileNumber;

	public Telephone() {}
	
	public Telephone(String telephoneId, long telephoneNumber, long mobileNumber) {
		super();
		this.telephoneId = telephoneId;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
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

	@Override
	public String toString() {
		return "Telephone [telephoneId=" + telephoneId + ", telephoneNumber=" + telephoneNumber + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
}