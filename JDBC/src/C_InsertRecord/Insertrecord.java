package C_InsertRecord;

import java.sql.*;

public class Insertrecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay","root","root");
		    Statement stmt=con.createStatement();
		    stmt.execute("insert into student values(2,'bbb',53)");
		    System.out.println("Data Inserted.................! ");
		    } 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
