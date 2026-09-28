package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.Controller;
import dbconnection.DBConnection;



public class Update {
	Scanner sc = new Scanner(System.in);
	String columnName = "";
	String displayName = "";
	int id ;

	public void UpdateInfo()throws ClassNotFoundException, SQLException {
		
		// showData() To Show information of student
		ViewInfo.showData();
		
		// getConnection() - Database Connection
		Connection con = DBConnection.getConnection();

		System.out.print("\nEnter Student Id: ");
		id = sc.nextInt();
		
		
		System.out.println("==============================");
		
		
         while (true) {
        	 System.out.println("What you want to Update:"
        			    + "\n1] FirstName:"
        			    + "\n2] LastName:"
        			    + "\n3] Gender:"
        			    + "\n4] CollageName:"
        			    + "\n5] Email:"
        			    + "\n6] MobileNo:"
        			    + "\n7] Password:"
        			    + "\n8] Exit Button:"
        			    + "\nEnter an option: ");
                    System.out.println("");
        			int choice = sc.nextInt();
        		
        			
        			switch (choice) {
        			    case 1: 
        			        columnName = "fname";
        			        displayName = "FirstName";
        			        break;
        			    case 2:
        			        columnName = "lname"; 
        			        displayName = "LastName";
        			        break;
        			    case 3:
        			        columnName = "gender";
        			        displayName = "Gender";
        			        break;
        			    case 4:
        			        columnName = "collagename";
        			        displayName = "CollageName";
        			        break;
        			    case 5:
        			        columnName = "email";
        			        displayName = "Email";
        			        break;
        			    case 6:
        			        columnName = "mobileno";
        			        displayName = "MobileNo";
        			        break;
        			    case 7:
        			        columnName = "password";
        			        displayName = "Password";
        			        break;
        			        
        			}
        			
        	   if(choice == 8) {
                   // Exit 
        		   Controller.SecondControl();
               }
        	   else {
        		   System.out.print("Enter new " + displayName + ": ");
                   String newValue = sc.next();

                   // CORRECT SQL SYNTAX: UPDATE table SET column = value WHERE condition
                   String sql = "UPDATE student SET " + columnName + " = ? WHERE id = ?";

                   PreparedStatement pstmt = con.prepareStatement(sql);
                   pstmt.setString(1, newValue); 
                   pstmt.setInt(2, id);           

                   int rows = pstmt.executeUpdate();

                   if (rows > 0) {
                   System.out.println(displayName + " updated successfully!");
                   System.out.println("==============================================");
                   } else {
                       System.out.println("Update failed! Student ID not found.");
                   }  
                   System.out.println("Update Complete");
                   
                  
        	   }
                
		}
		
        
        
		
	}

}

	
	
	
	

