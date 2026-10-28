package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	private Connection con;
	private String driver;
	private String url;
	private String username;
	private String password; 

	public static Connection jdbcconnection(String driver,String url,String username,String password) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}

}
