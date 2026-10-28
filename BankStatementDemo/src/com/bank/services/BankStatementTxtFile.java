package com.bank.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.bank.entity.Customer;

import hibernateUtil.HibernateUtil;

public class BankStatementTxtFile {

	public static void exportAllCustomersToFile() throws IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

	    List<Customer> list = session.createQuery("from Customer", Customer.class).list();

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter file Name:");
	    String fileName = sc.next();
	  
	   File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo\\"+fileName+".txt");
	   
	  if(file.createNewFile()) {
	    	System.out.println("File Created");
	    	try {
		        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		        writer.write("CID | NAME | AGE | BANK_ID | C_ADDR_ID | BANK_NAME | IFSC | BANK_ADDR | ADDR_ID | CITY | STATE | PINCODE | CITY | STATE | PINCODE ");
	            writer.newLine();
	            writer.write("________________________________________________________________________________________________________________________");
	            writer.newLine();
		        for (Customer c : list) {
		        	
		            writer.write(
		                    c.getCustomer_ID() + "           | " +
		                    c.getCustomer_Name() +  "         | " +
		                    c.getCustomer_Age() +  "       | " +
		                    c.getCustAc_NO()+ "       | " +
		                    c.getGender()+ "       | " +
		                    c.getDateOfBirth() +  "         | " +
		                    c.getMaritalStatus() +  "       | " 
		                 
                         
		                    
		            );

		            writer.newLine(); // 👉 next customer in next line
		        }

		        writer.close();
		        System.out.println("Done ✅");

	        }catch (Exception e) {
	        e.printStackTrace();
	    }

	    session.close();
	  }
	  }
}
