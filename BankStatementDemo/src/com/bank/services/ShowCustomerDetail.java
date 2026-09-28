package com.bank.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.JdbcConnection;

public class ShowCustomerDetail {
	 public static void showcustomerDetail(int customer_ID) throws ClassNotFoundException, SQLException {

		    Connection con = JdbcConnection.jdbcconnection(
		            "com.mysql.cj.jdbc.Driver",
		            "jdbc:mysql://localhost:3306/BankStatementGenerationSystem",
		            "root",
		            "root"
		    );

		    Statement stmt = con.createStatement();

		   
		    String sql="SELECT c.customer_ID, c.customer_Name, c.customer_Age, c.custAc_NO, c.gender, c.dateOfBirth, c.maritalStatus,\r\n"
		    		+ "		            b.bank_Name, b.ifscCode, b.bank_city , b.bank_state, b.bank_pincode , b.bank_country,\r\n"
		    		+ "		            ca.customer_city, ca.customer_state, ca.customer_pincode, ca.customer_country,\r\n"
		    		+ "		            ci.email, ci.phone\r\n"
		    		+ "		            \r\n"
		    		+ "		            FROM Customer_Details c\r\n"
		    		+ "		            JOIN Bank_Details b ON c.custAc_NO = b.custAc_NO \r\n"
		    		+ "		            JOIN CustomerAddress ca ON c.customer_Name = ca.customer_Name \r\n"
		    		+ "		            JOIN Contact_info ci ON c.customer_Name = ci.customer_Name where customer_ID="+customer_ID+"; ";

		    ResultSet rs = stmt.executeQuery(sql);		

		    
		    

		 // get metadata
		    int columnCount = rs.getMetaData().getColumnCount();

		 		    System.out.println();
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
		            System.out.print(rs.getString(i) + "            | ");
		        }
		       
		    }
		  
      rs.close();
		    stmt.close();
		    con.close();
		}

}
