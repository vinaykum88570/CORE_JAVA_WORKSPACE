package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnection.DBConnection;



public class ViewInfo {

    public static void showData() throws ClassNotFoundException, SQLException {
    	Scanner sc = new Scanner(System.in);
    	Connection con = DBConnection.getConnection();

    	String sql = "select * from student where id = ?";
    	PreparedStatement pstmt = con.prepareStatement(sql);

    	System.out.print("Enter Student Id: ");
    	int num = sc.nextInt();

    	// Parameter index starts from 1, not 0
    	pstmt.setInt(1, num);

    	ResultSet rs = pstmt.executeQuery();

    	
    	if (rs.next()) {
    	    // Use column names or correct indices (id is probably column 1, fname column 2, etc.)
    	    System.out.println("ID: " + rs.getInt("id"));
    	    System.out.println("Name: " + rs.getString("fname") + " " + rs.getString("lname"));
    	    System.out.println("Gender: " + rs.getString("gender"));
    	    System.out.println("College: " + rs.getString("collagename"));
    	    System.out.println("Email: " + rs.getString("email"));
    	    System.out.println("Mobile: " + rs.getString("mobileno"));
    	    // "Password: " + rs.getInt("password");
    	} else {
    	    System.out.println("Student with ID " + num + " not found!");
    	}
  	    
  	}
}
