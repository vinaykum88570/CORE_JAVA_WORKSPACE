package B_CreateTable;

import java.sql.*;


public class CreateDemo {
 public static void main(String[] args) {
	try {
	 Class c= Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con =DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay","root", "root");
	 
	Statement stmt = con.createStatement();
	stmt.execute("create table student(rollno int, name varchar(10), marks float)");
	//stmt.execute("create table emp(rollno int, name varchar(10), dob date)");
	
	System.out.println("Table created successfull:");
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
 }

//"jdbc:mysql://localhost:3306/vinay","root","root");
// public static java.sql.Connection getConnection
// public abstract Statement createStatement() throws SQLException;
// public abstract boolean execute(String, int) throws SQLException;
	