package com.bank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class Customer {	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int customer_ID;
	private  String customer_Name;
	private  int customer_Age;  
	private  int custAc_NO; 
	private  String gender;
	private String dateOfBirth;
	private String maritalStatus;
	
	private int customer_AddressID;
	private int contact_ID;
	private int bank_id;
	
     
  
	
	
    
      public Customer() {
	
       }    	
   
	

	public Customer(int customer_ID, String customer_Name, int customer_Age, int custAc_NO, String gender,
			String dateOfBirth, String maritalStatus, int customer_AddressID, int contact_ID, int bank_id) {
		super();
		this.customer_ID = customer_ID;
		this.customer_Name = customer_Name;
		this.customer_Age = customer_Age;
		this.custAc_NO = custAc_NO;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.customer_AddressID = customer_AddressID;
		this.contact_ID = contact_ID;
		this.bank_id = bank_id;
	}



	public int getCustomer_ID() {
		return customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public int getCustomer_Age() {
		return customer_Age;
	}

	public void setCustomer_Age(int customer_Age) {
		this.customer_Age = customer_Age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getCustAc_NO() {
		return custAc_NO;
	}

	public void setCustAc_NO(int custAc_NO) {
		this.custAc_NO = custAc_NO;
	}
	
	

	
	
	public int getCustomer_AddressID() {
		return customer_AddressID;
	}

	public void setCustomer_AddressID(int customer_AddressID) {
		this.customer_AddressID = customer_AddressID;
	}

	public int getContact_ID() {
		return contact_ID;
	}

	public void setContact_ID(int contact_ID) {
		this.contact_ID = contact_ID;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	@Override
	public String toString() {
		return "Customer [customer_ID=" + customer_ID + ", customer_Name=" + customer_Name + ", customer_Age="
				+ customer_Age + ", custAc_NO=" + custAc_NO + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", maritalStatus=" + maritalStatus + "]";
	}
	
	


	

	


	
	

	
    
}
