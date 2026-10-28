package com.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.connection.JdbcConnection;

public class BankStatementFile {
	
	public static void exportAllCustomersToFile() throws Exception {

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

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter file name: ");
	    String fileName = sc.next();

	    File file = new File("C:\\Users\\admin\\OneDrive\\Desktop\\Demo\\" + fileName + ".txt");
	    BufferedWriter writer = new BufferedWriter(new FileWriter(file));

	    // 🔹 Get ALL customers
	    ResultSet rs1 = stmt1.executeQuery("select * from Customer");

	    while (rs1.next()) {

	        int bankId = rs1.getInt("bankid");
	        int customerAddressId = rs1.getInt("customerAddressId");
	        int contact_ID = rs1.getInt("contact_ID");

	        // ---- BANK ----
	        ResultSet rs2 = stmt2.executeQuery("select * from Bank where bankID=" + bankId);
	        rs2.next();

	        // ---- ADDRESS ----
	        ResultSet rs3 = stmt3.executeQuery("select * from CustomerAddress where customerAddressID=" + customerAddressId);
	        rs3.next();

	        // ---- CONTACT ----
	        ResultSet rs4 = stmt4.executeQuery("select * from Contact_info where contact_ID=" + contact_ID);
	        rs4.next();

	        // ✅ WRITE ALL DATA IN ONE LINE
	        writer.write(
	                rs1.getInt("customer_ID") + " | " +
	                rs1.getString("customer_Name") + " | " +
	                rs1.getInt("customer_Age") + " | " +
	                rs1.getString("gender") + " | " +
	                rs1.getInt("dateOfBirth") + " | " +
	                rs1.getString("maritalStatus") + " | " +
	                

	                rs2.getString("bankName") + " | " +
	                rs2.getInt("ifscCode") + " | " +
	                rs2.getInt("branch_NO") +" | " +

	                rs3.getString("customer_city") + " | " +
	                rs3.getString("customer_state") + " | " +
	                rs3.getInt("customer_pincode") + " | " +
	                rs3.getString("customer_country") + " | " +

                    rs4.getString("customer_Name") + " | " +
	                rs4.getString("email") + " | " +
	                rs4.getInt("phone")
	        );

	        writer.newLine();

	        // close inner resultsets
	        rs2.close();
	        rs3.close();
	        rs4.close();
	    }

	    writer.close();

	    rs1.close();
	    stmt1.close();
	    stmt2.close();
	    stmt3.close();
	    stmt4.close();
	    con.close();

	    System.out.println("✅ All customers exported successfully!");
	}
}
