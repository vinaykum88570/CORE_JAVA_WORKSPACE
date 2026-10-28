package N_Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Ddemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
		Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/mavenmovies`","root","root" );
	}
	catch(Exception e) {
		System.out.println(e); 
	}
		System.out.println("connection Established successfull......");
		
		
	}
}
