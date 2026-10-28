package com.bank.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerAddress")
public class CustomerAddress  {

	
		@Id
		private int customer_AddressID;
		private String customer_city;
		private String customer_state;
		private int customer_pincode;
		private String customer_country;
	    
		
	    public CustomerAddress() {
			// TODO Auto-generated constructor stub
		}

		public CustomerAddress(int customer_AddressID, String customer_city,
				String customer_state, int customer_pincode, String customer_country) {
			super();
			this.customer_AddressID = customer_AddressID;
			
			this.customer_city = customer_city;
			this.customer_state = customer_state;
			this.customer_pincode = customer_pincode;
			this.customer_country = customer_country;
		}


		
		
		public String getCustomer_city() {
			return customer_city;
		}

		public void setCustomer_city(String customer_city) {
			this.customer_city = customer_city;
		}

		public String getCustomer_state() {
			return customer_state;
		}

		public void setCustomer_state(String customer_state) {
			this.customer_state = customer_state;
		}

		public int getCustomer_pincode() {
			return customer_pincode;
		}

		public void setCustomer_pincode(int customer_pincode) {
			this.customer_pincode = customer_pincode;
		}

		public String getCustomer_country() {
			return customer_country;
		}

		public void setCustomer_country(String customer_country) {
			this.customer_country = customer_country;
		}

		public int getCustomer_AddressID() {
			return customer_AddressID;
		}

		public void setCustomer_AddressID(int customer_AddressID) {
			this.customer_AddressID = customer_AddressID;
		}

		

		

		
	
		
	    
}
