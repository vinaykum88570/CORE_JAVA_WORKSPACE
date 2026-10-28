package com.bank.services;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bank.entity.Bank;
import com.bank.entity.ContactInfo;
import com.bank.entity.Customer;
import com.bank.entity.CustomerAddress;

import hibernateUtil.HibernateUtil;



public class SaveCustomerData {


	public static void saveDetails(){
		System.out.println("line 1");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("line 2");
		Transaction tx = session.beginTransaction();
		Scanner sc= new Scanner(System.in);
		
		// Customer
		Customer customer = new Customer();
		
		System.out.print("Enter Customer Name:");
		customer.setCustomer_Name(sc.next());
		System.out.print("Enter Customer Age:");
		customer.setCustomer_Age(sc.nextInt());
		System.out.print("Enter Customer Account No:");
		customer.setCustAc_NO(sc.nextInt());
		System.out.print("Enter gender:");
		customer.setGender(sc.next());
		System.out.print("Enter Date Of Birth:");
		customer.setDateOfBirth(sc.next());
		System.out.print("Enter maritalStatus:");
		customer.setMaritalStatus(sc.next());
		System.out.print("Enter Customer Address ID:");
		customer.setCustomer_ID(sc.nextInt());
		System.out.print("Enter Customer contact_ID:");
		customer.setContact_ID(sc.nextInt());
		System.out.print("Enter Customer Bank_ID:");
		customer.setBank_id(sc.nextInt());
		
		
		// Bank 
		Bank bank = new Bank();
		
		bank.setBank_id(customer.getBank_id());
		System.out.print("Enter Bank Name:");
		bank.setBank_Name(sc.next());
		System.out.print("Enter Bank Branch No:");
		bank.setBranch_NO(sc.nextInt());
		System.out.print("Enter IfscCode:");
		bank.setIfscCode(sc.nextInt());
		System.out.print("Enter Bank Address/City:");
		bank.setBank_city(sc.next());
		System.out.print("Enter Bank Address/State:");
		bank.setBank_state(sc.next());
		System.out.print("Enter Bank Address/Pincode:");
		bank.setBank_pincode(sc.nextInt());
		System.out.print("Enter Bank Address/Country:");
		bank.setBank_country(sc.next());
		
		
		//Customer Address
		CustomerAddress customerAddress = new CustomerAddress();
		
		customerAddress.setCustomer_AddressID(customer.getCustomer_AddressID());
		System.out.print("Enter Customer Address/City:");
		customerAddress.setCustomer_city(sc.next());
		System.out.print("Enter Customer Address/State:");
		customerAddress.setCustomer_state(sc.next());
		System.out.print("Enter Customer Address/Pincode:");
		customerAddress.setCustomer_pincode(sc.nextInt());
		System.out.print("Enter Customer Address/Country:");
		customerAddress.setCustomer_country(sc.next());
		
		
		// Contact Info 
		ContactInfo contactInfo = new ContactInfo();
		
		contactInfo.setContact_ID(customer.getContact_ID());
		System.out.print("Enter Email:");
		contactInfo.setEmail(sc.next());
		System.out.print("Enter Phone:");
		contactInfo.setPhone(sc.nextInt());
	
		
		
		
		
		
		session.save(customer);
		session.save(bank);
		session.save(customerAddress);
		session.save(contactInfo);
		
		tx.commit();
		
	}
	
	

}
