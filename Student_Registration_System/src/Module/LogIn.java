package Module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Controller;
import dbconnection.DBConnection;

public class LogIn {
	

	public static void LogIn() throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		String sql="select * from student where email=? and password=? ";
		
		System.out.println("Enter Email:");
		String email =  sc.next();
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		// Validation Email and Password
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("\nLogIn Successfully");
			Controller.SecondControl();
		}
		else {
			System.out.println("Please Try Again\n ");
			LogIn();
		}
		
	}
}
