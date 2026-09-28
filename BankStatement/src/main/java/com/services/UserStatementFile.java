package com.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.hibernate.Session;

import com.entity.Bank;
import com.entity.Customer;
import com.entity.CustomerAddress;
import com.hibernateUtil.HibernateUtil;
import com.jdbc.connection.JdbcConnection;

public class UserStatementFile {
	public static void exportCustomerToFile(int customer_ID) throws Exception {

	    Connection con = JdbcConnection.jdbcconnection(
	            "com.mysql.cj.jdbc.Driver",
	            "jdbc:mysql://localhost:3306/bankstatementgenerationsystem",
	            "root",
	            "root"
	    );

	    Statement stmt1 = con.createStatement();
	    Statement stmt2 = con.createStatement();
	    Statement stmt3 = con.createStatement();
	    Statement stmt4 = con.createStatement();

	    // Create File
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter file name: ");
	    String fileName = sc.next();

	    File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo\\" + fileName + ".txt");

	    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

	    int bankId = 0;
	    int customerAddressId = 0;
	    int contact_ID = 0;

	    // ================= CUSTOMER =================
	    ResultSet rs1 = stmt1.executeQuery("select * from Customer where customer_ID=" + customer_ID);

	    if (rs1.next()) {

	        bankId = rs1.getInt("bankid");
	        customerAddressId = rs1.getInt("customerAddressId");
	        contact_ID = rs1.getInt("contact_ID");

	        writer.write("====== CUSTOMER DETAILS =====");
	        writer.newLine();

	        writer.write("customer_ID: " + rs1.getInt("customer_ID"));
	        writer.newLine();
	        writer.write("customer_Name: " + rs1.getString("customer_Name"));
	        writer.newLine();
	        writer.write("customer_Age: " + rs1.getInt("customer_Age"));
	        writer.newLine();
	        writer.write("gender: " + rs1.getString("gender"));
	        writer.newLine();
	        writer.write("dateOfBirth: " + rs1.getString("dateOfBirth"));
	        writer.newLine();
	        writer.write("maritalStatus: " + rs1.getString("maritalStatus"));
	        writer.newLine();
	    }
	    rs1.close();

	    // ================= BANK =================
	    ResultSet rs2 = stmt2.executeQuery("select * from Bank where bankID=" + bankId);

	    if (rs2.next()) {

	        writer.newLine();
	        writer.write("------ BANK DETAILS ------");
	        writer.newLine();

	        writer.write("bankID: " + rs2.getInt("bankID"));
	        writer.newLine();
	        writer.write("bankName: " + rs2.getString("bankName"));
	        writer.newLine();
	        writer.write("ifscCode: " + rs2.getInt("ifscCode"));
	        writer.newLine();
	        writer.write("branch_NO: " + rs2.getInt("branch_NO"));
	        writer.newLine();
	    }
	    rs2.close();

	    // ================= CUSTOMER ADDRESS =================
	    ResultSet rs3 = stmt3.executeQuery("select * from CustomerAddress where customerAddressID=" + customerAddressId);

	    if (rs3.next()) {

	        writer.newLine();
	        writer.write("------ CUSTOMER ADDRESS ------");
	        writer.newLine();

	        writer.write("city: " + rs3.getString("customer_city"));
	        writer.newLine();
	        writer.write("state: " + rs3.getString("customer_state"));
	        writer.newLine();
	        writer.write("pincode: " + rs3.getInt("customer_pincode"));
	        writer.newLine();
	        writer.write("country: " + rs3.getString("customer_country"));
	        writer.newLine();
	    }
	    rs3.close();

	    // ================= CONTACT INFO =================
	    ResultSet rs4 = stmt4.executeQuery("select * from Contact_info where contact_ID=" + contact_ID);

	    if (rs4.next()) {

	        writer.newLine();
	        writer.write("------ CONTACT INFO ------");
	        writer.newLine();

	        writer.write("Name: " + rs4.getString("customer_Name"));
	        writer.newLine();
	        writer.write("Email: " + rs4.getString("email"));
	        writer.newLine();
	        writer.write("Phone: " + rs4.getInt("phone"));
	        writer.newLine();
	    }
	    rs4.close();

	    writer.write("\n=====================================");
	    writer.newLine();

	    writer.close();

	    // Close DB
	    stmt1.close();
	    stmt2.close();
	    stmt3.close();
	    stmt4.close();
	    con.close();

	    System.out.println("File exported successfully!");
	}
	
}



