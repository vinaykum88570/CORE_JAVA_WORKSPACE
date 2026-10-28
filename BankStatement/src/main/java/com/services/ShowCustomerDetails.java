package com.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.JdbcConnection;

public class ShowCustomerDetails {

    public static void customerDetails(int customer_ID) throws ClassNotFoundException, SQLException {

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

        //CUSTOMER
        ResultSet rs1 = stmt1.executeQuery("select * from Customer where customer_ID=" + customer_ID);

        int bankId = 0;
        int customerAddressId = 0;
        int contact_ID = 0;

        if (rs1.next()) {

            System.out.println("====== Customer =====");

            bankId = rs1.getInt("bankid");
            customerAddressId = rs1.getInt("customerAddressId");
            contact_ID = rs1.getInt("contact_ID");

            System.out.println("customer_ID :" + rs1.getInt("customer_ID"));
            System.out.println("customer_Age :" + rs1.getInt("customer_Age"));
            System.out.println("bankID :" + bankId);
            System.out.println("customerAddressId :" + customerAddressId);
            System.out.println("customer_Name :" + rs1.getString("customer_Name"));
            System.out.println("custAc_NO :"+ rs1.getInt("custAc_NO"));
            System.out.println("gender :"+rs1.getString("gender"));
            System.out.println("contact_ID :"+rs1.getInt("contact_ID"));
            System.out.println("dateOfBirth :"+rs1.getString("dateOfBirth"));
            System.out.println("maritalStatus :"+rs1.getString("maritalStatus"));
        }
        rs1.close();

        // BANK
        ResultSet rs2 = stmt2.executeQuery("select * from Bank where bankID=" + bankId);


        if (rs2.next()) {

            System.out.println("\n====== Bank =====");

            

            System.out.println("bankID :" + rs2.getInt("bankID"));
            System.out.println("bankName :" +rs2.getString("bankName") );
            System.out.println("ifscCode :" + rs2.getInt("ifscCode"));
            System.out.println("branch_NO :" + rs2.getInt("branch_NO"));
            System.out.println("bank_city :" + rs2.getString("bank_city"));
            System.out.println("bank_state :" + rs2.getString("bank_state"));
            System.out.println("bank_pincode :" + rs2.getInt("bank_pincode"));
            System.out.println("bank_country :" + rs2.getString("bank_country"));
        }
        rs2.close();


        //CUSTOMER ADDRESS
        ResultSet rs3 = stmt4.executeQuery("select * from CustomerAddress where customerAddressID=" + customerAddressId);

        if (rs3.next()) {

            System.out.println("\n====== CustomerAddress =====");

            System.out.println("customerAddressId :" + rs3.getInt("customerAddressId"));
            System.out.println("customer_city :" + rs3.getString("customer_city"));
            System.out.println("customer_state :" + rs3.getString("customer_state"));
            System.out.println("customer_pincode :" + rs3.getInt("customer_pincode"));
            System.out.println("customer_country :" + rs3.getString("customer_country"));
        }
        rs3.close();
        
        ResultSet rs4 = stmt4.executeQuery("select * from Contact_info where contact_ID=" + contact_ID);

        if (rs4.next()) {

            System.out.println("\n====== ContactInfo =====");

            System.out.println("contact_ID :" + rs4.getInt("contact_ID"));
            System.out.println("customer_Name :" + rs4.getString("customer_Name"));
            System.out.println("email :" + rs4.getString("email"));
            System.out.println("phone :" + rs4.getInt("phone"));
            
        }
        rs3.close();

        // 🔹 Close all
        stmt1.close();
        stmt2.close();
        stmt3.close();
        stmt4.close();
        con.close();
    }
}  
	    