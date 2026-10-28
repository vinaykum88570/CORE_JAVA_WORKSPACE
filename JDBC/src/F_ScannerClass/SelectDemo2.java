package F_ScannerClass;

import java.sql.*;
import java.util.Scanner;

public class SelectDemo2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay","root","root");
			PreparedStatement pstmt =con.prepareStatement("select * from student where rollno=?");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter roll no:");
			int n=sc.nextInt();
			pstmt.setInt(1, n);
			
			ResultSet rs= pstmt.executeQuery();
			rs.next();
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getInt(3)+" ");
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
