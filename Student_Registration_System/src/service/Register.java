package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Module.Student;
import dbconnection.DBConnection;

public class Register {
	Student name;
	
	Scanner sc = null;

	public void register() {
		 sc = new Scanner(System.in);
		 name =  new Student();
	 	
		System.out.print("Enter Frist name:");
		name.setFname(sc.next());
		
 		
   		System.out.print("Enter Last name:");
   		name.setLname(sc.next());
 	  	
   		System.out.print("Enter Gender:");
   		name.setGender(sc.next());
 	  	
   		System.out.print("Enter Collage name:");
   		name.setCollageName(sc.next());
   		
   		System.out.print("Enter MobileNo:");
   		name.setMobileNo(sc.next());
   		
   		System.out.print("Enter Email:");
   		name.setEmail(sc.next());
 	  	
   		System.out.print("Enter Password:");
   		name.setPassword(sc.next());
   		
          }
	
	 // Info inserted into database
     public void submitDB() throws ClassNotFoundException, SQLException  {
 	  // call getconnection methods
      name =  new Student(); 
 	  Connection con = DBConnection.getConnection();        
     
 	  String sql = "insert into student(fname,lname ,gender,collagename ,email,mobileno ,password)"
 			   + "values(?,?,?,?,?,?,?)";
 	
 	  PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
 	
 	    pstmt.setString(1, name.getFname());
		pstmt.setString(2, name.getLname());
		pstmt.setString(3, name.getGender());
		pstmt.setString(4, name.getCollageName());
		pstmt.setString(5, name.getEmail());
		pstmt.setString(6, name.getMobileNo());
		pstmt.setString(7, name.getPassword());

		pstmt.execute();
		
		 ResultSet rs = pstmt.getGeneratedKeys();
       if (rs.next()) {
      
          System.out.println("Registration successful! \nYour Student ID is: " +rs.getInt(1) );
      }
      
     
		
		    
	 }
  
}
