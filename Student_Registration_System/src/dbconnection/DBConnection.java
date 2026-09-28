package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnection {

	// Database getconnection methods.
	// Connection con = DBConnection.getConnection();
	public static  Connection getConnection()throws ClassNotFoundException, SQLException{
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://@localhost:3306/Demo";
		String username="root";
		String password="root";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username , password);
		
		return con;
	}
}
