package com.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Bank;
import com.entity.ContactInfo;
import com.entity.Customer;
import com.entity.CustomerAddress;
import com.hibernateUtil.HibernateUtil;
import com.jdbc.connection.JdbcConnection;

public class SaveCustomerData {

//	public static void saveDetails(){
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		
//		
//		
//		Customer customer =               new Customer("C", 3, 2, 222);
//	    Bank bank =                       new Bank(customer.getBankId(), "C", "C",333, 333);
//	    BankAddress bankAddress =         new BankAddress(bank.getAddressId(), "C", "C", 333);
//		CustomerAddress customerAddress = new CustomerAddress(customer.getCustomerAddressId(),"C","C",333);
//		
//		
//		customer.setBank(bank);
//		customer.setBankAddress(bankAddress);
//		customer.setCustomerAddress(customerAddress);
//		session.saveOrUpdate(customer);
//		session.saveOrUpdate(bank);
//		session.saveOrUpdate(bankAddress);
//		session.saveOrUpdate(customerAddress);
//		tx.commit();
//		
//	}

	
	
	public static void saveDetails() throws IOException, ClassNotFoundException, SQLException{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
	          
		
		Customer customer = new Customer();
		System.out.print("Enter Customer Name:");
		customer.setCustomer_Name(br.readLine());
		System.out.print("Enter Customer Age:");
		customer.setCustomer_Age(Integer.parseInt(br.readLine()));
		System.out.print("Enter Bank Id:");
		customer.setBankId(Integer.parseInt(br.readLine()));
		System.out.print("Enter Customer Address Id:");
		customer.setCustomerAddressId(Integer.parseInt(br.readLine()));
		System.out.print("Enter Customer Account No:");
		customer.setCustAc_NO(Integer.parseInt(br.readLine()));
		System.out.print("Enter gender:");
		customer.setGender(br.readLine());
		System.out.print("Enter Contact ID:");
		customer.setContact_ID(Integer.parseInt(br.readLine()));
		System.out.print("Enter Date Of Birth:");
		customer.setDateOfBirth(br.readLine());
		System.out.print("Enter maritalStatus:");
		customer.setMaritalStatus(br.readLine());
		
		Bank bank = new Bank();
		bank.setBankId(customer.getBankId());
		System.out.print("Enter Bank Name:");
		bank.setBankName(br.readLine());
		System.out.print("Enter Bank IFSC Code:");
		bank.setIfscCode(Integer.parseInt(br.readLine()));
		System.out.print("Enter Bank Branch No:");
		bank.setBranch_NO(Integer.parseInt(br.readLine()));
		System.out.print("Enter Bank Address/City:");
		bank.setBank_city(br.readLine());
		System.out.print("Enter Bank Address/State:");
		bank.setBank_state(br.readLine());
		System.out.print("Enter Bank Address/Pincode:");
		bank.setBank_pincode(Integer.parseInt(br.readLine()));
		System.out.print("Enter Bank Address/Country:");
		bank.setBank_country(br.readLine());
		
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setCustomerAddressId(customer.getCustomerAddressId());
		System.out.print("Enter Customer Address/City:");
		customerAddress.setCustomer_city(br.readLine());
		System.out.print("Enter Customer Address/State:");
		customerAddress.setCustomer_state(br.readLine());
		System.out.print("Enter Customer Address/Pincode:");
		customerAddress.setCustomer_pincode(Integer.parseInt(br.readLine()));
		System.out.print("Enter Customer Address/Country:");		
		customerAddress.setCustomer_country(br.readLine());
		
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setContact_ID(customer.getContact_ID());
		contactInfo.setCustomer_Name(customer.getCustomer_Name());
		System.out.print("Enter Email:");
		contactInfo.setEmail(br.readLine());
		System.out.print("Enter Phone:");
		contactInfo.setPhone(Integer.parseInt(br.readLine()));
		
		
//		customer.setBank(bank);
//		customer.setCustomerAddress(customerAddress);
//		customer.setContactinfo(contactInfo);
		
		
		session.save(customer);
        session.save(bank);
        session.save(customerAddress);
        session.save(contactInfo);
		tx.commit();
		
	}
	
	
}
