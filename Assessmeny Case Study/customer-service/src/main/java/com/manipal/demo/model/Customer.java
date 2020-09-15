package com.manipal.demo.model;


import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
		@Id
		@Column(name="customer_id")
		private String customerId;
		
		@Column(name="customer_firstname")
		private String customerFirstname;
		
		@Column(name="customer_lastname")
		private String customerLastname;
		
		@Column(name="customer_dob")
		private Date customerDob;
		
		@Embedded
		private Telephone telephone;
		
		@Column(name="customer_email")
		private String customerEmail;

		
		public Customer() {}
		
		
		public Customer(String customerId, String customerFirstname, String customerLastname, Date customerDob,
				Telephone telephone, String customerEmail) {
			super();
			this.customerId = customerId;
			this.customerFirstname = customerFirstname;
			this.customerLastname = customerLastname;
			this.customerDob = customerDob;
			this.telephone = telephone;
			this.customerEmail = customerEmail;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCustomerFirstname() {
			return customerFirstname;
		}

		public void setCustomerFirstname(String customerFirstname) {
			this.customerFirstname = customerFirstname;
		}

		public String getCustomerLastname() {
			return customerLastname;
		}

		public void setCustomerLastname(String customerLastname) {
			this.customerLastname = customerLastname;
		}

		public Date getCustomerDob() {
			return customerDob;
		}

		public void setCustomerDob(Date customerDob) {
			this.customerDob = customerDob;
		}

		public Telephone getTelephone() {
			return telephone;
		}

		public void setTelephone(Telephone telephone) {
			this.telephone = telephone;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerFirstname=" + customerFirstname
					+ ", customerLastname=" + customerLastname + ", customerDob=" + customerDob + ", telephone="
					+ telephone + ", customerEmail=" + customerEmail + "]";
		}
		
		
}