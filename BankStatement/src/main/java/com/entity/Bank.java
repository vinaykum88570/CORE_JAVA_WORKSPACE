package com.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")
public class Bank  {
	
    @Id
    private int bankId;
    private String bankName;
    private int ifscCode;
    private  int branch_NO;
    private String bank_city;
	private String bank_state;
	private int bank_pincode;
	private String bank_country;
    
    public Bank() {
		
	}
	
    
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getBranch_NO() {
		return branch_NO;
	}

	public void setBranch_NO(int branch_NO) {
		this.branch_NO = branch_NO;
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

	

    
}
