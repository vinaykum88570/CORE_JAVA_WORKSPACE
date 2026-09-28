package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import dbconnection.DBConnection;

/**
 * - Exeute query " Delete from student where id=? '
 * - Ask id to remove data from database
 * 
 */
public class Remove {
	
	
	public static void removeInfo() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		String sql="Delete from student where id=?";
		
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		System.out.print("Enter Student Id:");
		int id = sc.nextInt();
		
		pstmt.setInt(1, id);
		
	    int rowDelete = pstmt.executeUpdate();
	    
	    if(rowDelete>0) {
	    	System.out.println("Student Deleted Successfully.");
	    }else {
	    	System.out.println("ID Not Found....!");
		}
		
	}
	
 }
