package com.bank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact_info")
public class ContactInfo {

	@Id
	private int contact_ID;
	private String customer_Name;
	private String email;
	private int phone;
	
	
	public ContactInfo() {
		
	}

	public ContactInfo(int contact_ID, String customer_Name, String email, int phone) {
		super();
		this.contact_ID = contact_ID;
		this.customer_Name = customer_Name;
		this.email = email;
		this.phone = phone;
	}

	public int getContact_ID() {
		return contact_ID;
	}

	public void setContact_ID(int contact_ID) {
		this.contact_ID = contact_ID;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactInfo [customer_Name=" + customer_Name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
