package com.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.JdbcConnection;

public class CountCustomer {
    static int count;
	
	 public static int customerCount() throws ClassNotFoundException, SQLException {

	        Connection con = JdbcConnection.jdbcconnection(
	                "com.mysql.cj.jdbc.Driver",
	                "jdbc:mysql://localhost:3306/bankstatementgenerationsystem",
	                "root",
	                "root"
	        );

	        Statement stmt = con.createStatement();

	        String query = "select sum(customer_ID) from customer;";

	        ResultSet rs = stmt.executeQuery(query);

	        if (rs.next()) {
			 count = rs.getInt(1);
			}
	        
	        
			if (count > 0) {
				count = count + 1;
			} else {
				count=1;
			}
			return count;
	        
	 }
}
