package com.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.JdbcConnection;

public class ListOfCustomerDetails {

	 public static void customerAllDetails() throws ClassNotFoundException, SQLException {

	        Connection con = JdbcConnection.jdbcconnection(
	                "com.mysql.cj.jdbc.Driver",
	                "jdbc:mysql://localhost:3306/bankstatementgenerationsystem",
	                "root",
	                "root"
	        );

	        Statement stmt = con.createStatement();

	        String query = "SELECT c.cid, c.name, c.age, " +
	                "b.bankID, b.bankname, b.ifscCode, " +
	                "ba.city AS bank_city, ba.state AS bank_state, ba.pincode AS bank_pincode, " +
	                "ca.city AS cust_city, ca.state AS cust_state, ca.pincode AS cust_pincode " +
	                "FROM Customer c " +
	                "JOIN Bank b ON c.bankID = b.bankID " +
	                "JOIN BankAddress ba ON b.addressId = ba.addressId " +
	                "JOIN CustomerAddress ca ON c.customerAddressId = ca.customerAddressID";

	        ResultSet rs = stmt.executeQuery(query);

	        while (rs.next()) {

	            System.out.println(
	                    rs.getInt("cid") + " | " +
	                    rs.getString("name") + " | " +
	                    rs.getInt("age") + " | " +

	                    rs.getInt("bankID") + " | " +
	                    rs.getString("bankname") + " | " +
	                    rs.getInt("ifscCode") + " | " +

	                    rs.getString("bank_city") + " | " +
	                    rs.getString("bank_state") + " | " +
	                    rs.getInt("bank_pincode") + " | " +

	                    rs.getString("cust_city") + " | " +
	                    rs.getString("cust_state") + " | " +
	                    rs.getInt("cust_pincode")
	            );
	        }

	        rs.close();
	        con.close();
	    }
	 public static void listOfCustomerDetails() throws ClassNotFoundException, SQLException {

		    Connection con = JdbcConnection.jdbcconnection(
		            "com.mysql.cj.jdbc.Driver",
		            "jdbc:mysql://localhost:3306/bankstatementgenerationsystem",
		            "root",
		            "root"
		    );

		    Statement stmt = con.createStatement();

		    String sql="SELECT c.customer_ID, c.customer_Name, c.customer_Age, c.custAc_NO, c.gender, c.dateOfBirth, c.maritalStatus,\r\n"
		    		+ "				b.bankName, b.ifscCode, b.branch_NO , b.bank_city , b.bank_state, b.bank_pincode , b.bank_country,\r\n"
		    		+ "		            ca.customer_city, ca.customer_state, ca.customer_pincode, ca.customer_country,\r\n"
		    		+ "		            ci.email, ci.phone\r\n"
		    		+ "		            \r\n"
		    		+ "		            FROM customer c \r\n"
		    		+ "		            JOIN bank b ON c.bankId = b.bankId \r\n"
		    		+ "		            JOIN CustomerAddress ca ON c.customerAddressId = ca.customerAddressId	 \r\n"
		    		+ "		            JOIN Contact_info ci ON c.customer_Name = ci.customer_Name ";

		    ResultSet rs = stmt.executeQuery(sql);

		    
		    

		 // get metadata
		    int columnCount = rs.getMetaData().getColumnCount();

		    System.out.println(
		            "customer_ID    | customer_Name    | customer_Age  |" +
		            "custAc_NO        | gender          | dateOfBirth      |" +
		            "maritalStatus  | bank_Name       | ifscCode      |" +
		            "  bank_city       | bank_state    | bank_pincode   |" +
		            "bank_country      | customer_city    | customer_state  |"+
		            "customer_pincode | customer_country| email                 |phone        " 
		    );
		    System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
			  while (rs.next()) {
		    	System.out.println();
		        for (int i = 1; i <= columnCount; i++) {
		            System.out.print(rs.getString(i) + "       | ");
		        }
		       
		    }
		  
            rs.close();
		    stmt.close();
		    con.close();
		}
	
   
}