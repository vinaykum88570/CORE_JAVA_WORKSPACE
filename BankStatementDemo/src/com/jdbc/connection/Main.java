package com.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = JdbcConnection.jdbcconnection("com.mysql.cj.jdbc.Driver","jdbc:mysql://@localhost:3306/Demo","root","root");
	    System.out.println(con);
	}

}
