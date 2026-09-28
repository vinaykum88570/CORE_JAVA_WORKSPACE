package E_InsertDynamically;

import java.sql.*;

public class InsertInto {
	public static void main(String[] args) {
		try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay", "root", "root");
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
		pstmt.setInt(1, Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		pstmt.setInt(3, Integer.parseInt(args[2]));
		pstmt.executeUpdate();
		System.out.println("One Record Inserted........!");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
