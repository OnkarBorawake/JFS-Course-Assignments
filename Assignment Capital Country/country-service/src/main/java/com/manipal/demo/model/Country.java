package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="country1")
public class Country {
		@Id
		@Column(name="country_code")
		private String countryCode;
		@Column(name="country_name")
		private String countryName;
		
		@Embedded
		private Capital capital;
		public Country() {}

		public Country(String countryCode, String countryName, Capital capital) {
			super();
			this.countryCode = countryCode;
			this.countryName = countryName;
			this.capital = capital;
		}
		
		public Capital getCapital() {
			return capital;
		}

		public void setCapital(Capital capital) {
			this.capital = capital;
		}


		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		@Override
		public String toString() {
			return "Country [countryCode=" + countryCode + ", countryName=" + countryName + "]";
		}


		
		
}