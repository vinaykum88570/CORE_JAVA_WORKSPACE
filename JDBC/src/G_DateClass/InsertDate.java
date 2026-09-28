package G_DateClass;

import java.sql.*;

public class InsertDate {
public static void main(String[] args) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vinay","root","root");
			PreparedStatement pstmt= con.prepareStatement("insert into emp values(?,?,?)");
			// empno | name | dob
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setDate(3,Date.valueOf(args[2]) );
			pstmt.execute();
			// Date Formate YYYY-MM-DD
			System.out.println("One record Inserted Successfully......!");
		 }catch(ClassNotFoundException | SQLException  ce) {
			    ce.printStackTrace();
			 }
}
}
