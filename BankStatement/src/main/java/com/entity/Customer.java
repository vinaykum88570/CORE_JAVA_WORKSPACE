package com.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int customer_ID;
	private  String customer_Name;
	private  int customer_Age;
	private  int bankId;   
	private  int customerAddressId; 
	private  int custAc_NO; 
	private  String gender;
	private int contact_ID;
	private String dateOfBirth;
	private String maritalStatus;
     
//	private Bank bank;
//	private CustomerAddress customerAddress;
//	private ContactInfo contactinfo;
   
    
      public Customer() {
	// TODO Auto-generated constructor stub
       }    	
    
	
	
	public Customer(int customer_ID, String customer_Name, int customer_Age, int bankId, int customerAddressId,
			int contact_ID, int custAc_NO, String gender, String dateOfBirth, String maritalStatus) {
		super();
		this.customer_ID = customer_ID;
		this.customer_Name = customer_Name;
		this.customer_Age = customer_Age;
		this.bankId = bankId;
		this.customerAddressId = customerAddressId;
		this.contact_ID = contact_ID;
		this.custAc_NO = custAc_NO;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
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
	public int getContact_ID() {
		return contact_ID;
	}
	public void setContact_ID(int contact_ID) {
		this.contact_ID = contact_ID;
	}
	public int getCustAc_NO() {
		return custAc_NO;
	}
	public void setCustAc_NO(int custAc_NO) {
		this.custAc_NO = custAc_NO;
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
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public int getCustomerAddressId() {
		return customerAddressId;
	}
	public void setCustomerAddressId(int customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

//	public Bank customer() {
//		return bank;
//	}
//
//	public void setBank(Bank bank) {
//		this.bank = bank;
//	}
//
//	public Bank getBank() {
//		return bank;
//	}
//
//
//	public ContactInfo getContactinfo() {
//		return contactinfo;
//	}
//
//	public void setContactinfo(ContactInfo contactinfo) {
//		this.contactinfo = contactinfo;
//	}
//
//	public CustomerAddress getCustomerAddress() {
//		return customerAddress;
//	}
//
//	public void setCustomerAddress(CustomerAddress customerAddress) {
//		this.customerAddress = customerAddress;
//	}

	
    
}
