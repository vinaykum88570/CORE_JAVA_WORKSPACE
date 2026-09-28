package J_Resultset_Inhancement;

import java.sql.*;
public class MoveCursor {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinay","root","root");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from student");
		rs.absolute(2);
		System.out.print(rs.getInt("rollno")+" ");
		System.out.print(rs.getString("name")+" ");
		System.out.println(rs.getInt("marks"));
		
		 }catch(ClassNotFoundException | SQLException ce) {
		 ce.printStackTrace();
		 }
}
}
