package com.bank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank_Details")
public class Bank  {
	
    @Id
    private int bank_id;
    private String bank_Name;
    private  int branch_NO;
    private int ifscCode;  
    private String bank_city;
	private String bank_state;
	private int bank_pincode;
	private String bank_country;
	
	
   
    
    public Bank() {
		
	}

	


	public Bank(int bank_id, int branch_NO, String bank_Name, int ifscCode, String bank_city, String bank_state,
			int bank_pincode, String bank_country) {
		super();
		this.bank_id = bank_id;
		this.branch_NO = branch_NO;
		this.bank_Name = bank_Name;
		this.ifscCode = ifscCode;
		this.bank_city = bank_city;
		this.bank_state = bank_state;
		this.bank_pincode = bank_pincode;
		this.bank_country = bank_country;
	}




	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public int getBranch_NO() {
		return branch_NO;
	}

	public void setBranch_NO(int custAc_NO) {
		this.branch_NO = custAc_NO;
	}

	public String getBank_Name() {
		return bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBank_city() {
		return bank_city;
	}


	public void setBank_city(String bank_city) {
		this.bank_city = bank_city;
	}


	public String getBank_state() {
		return bank_state;
	}


	public void setBank_state(String bank_state) {
		this.bank_state = bank_state;
	}


	public int getBank_pincode() {
		return bank_pincode;
	}


	public void setBank_pincode(int bank_pincode) {
		this.bank_pincode = bank_pincode;
	}


	public String getBank_country() {
		return bank_country;
	}


	public void setBank_country(String bank_country) {
		this.bank_country = bank_country;
	}

	@Override
	public String toString() {
		return "Bank [custAc_NO=" + branch_NO + ", bank_Name=" + bank_Name + ", ifscCode=" + ifscCode + ", bank_city="
				+ bank_city + ", bank_state=" + bank_state + ", bank_pincode=" + bank_pincode + ", bank_country="
				+ bank_country + "]";
	}

	
	
}
