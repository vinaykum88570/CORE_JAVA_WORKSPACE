package controller;


import java.sql.SQLException;


import java.util.Scanner;

import javax.security.auth.login.LoginContext;

import Module.LogIn;
import Module.Student;
import service.ViewInfo;
import service.Register;
import service.Remove;
import service.Update;


public class Controller {
	
	// Database Name ==> student 
	public static void FirstControl()throws ClassNotFoundException, SQLException  {

		boolean running = true;
		
		
		    while (running) {
		    	System.out.println("==============================================="+""+ "\n");
		    	System.out.println("Student Registration System");
		      System.out.println("\n1. Login");
		  		System.out.println("2. Register");
		  		
		  		System.out.print("\nEnter an option: ");
	     		
	     		
	     		
		  		Scanner sc = new Scanner(System.in);
	            int opt = sc.nextInt();
	     		
	             switch (opt) {
			        case 1:
			        	LogIn.LogIn();
			            break;

			        case 2: // - Registration
			        	new Register().register();
					    // - Insert Data Into DataBase
					    new Register().submitDB();
			            break;

			        
			      }
	             
	     		// Break the loop
			    if(opt == 7)
			    	break;
	        }
		    System.out.println("Than you.........!");
		    System.out.println("==============================================="+""+ "\n");
     } 
	
	public static void SecondControl() throws ClassNotFoundException, SQLException {
		
		while(true) {
			System.out.println("1. Edit");
	  		System.out.println("2. View");
	  		System.out.println("3. Log Out");
	  		System.out.println("4. Change Password");
	  		System.out.println("5. Exit");
	  		System.out.println("6. ");
	  		System.out.print("\nEnter an option: ");
	  		
	  		Scanner sc = new Scanner(System.in);
	  		int opt = sc.nextInt();
	  		switch (opt) {
	        case 1:
	        	// Update Information
	        	new Update().UpdateInfo();
	            break;

	        case 2: 
	        	// View Information
	            ViewInfo.showData();
	            break;

	        case 3:
	        	// Log Out 
	        	Remove.removeInfo();
	        	break;

	        case 4:
	        	// Exit
	            break;
	         }
	  	if(opt==5)
	  		break;
		}
		
    }
	
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	// Conttroller class methods 
	FirstControl();
	
  }

}