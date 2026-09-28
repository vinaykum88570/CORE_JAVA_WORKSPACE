package H_ChangeDateFormate;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ChangeDate {
public static void main(String[] args) {
	try {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay", "root", "root");
		PreparedStatement pstmt = con.prepareStatement("insert into Emp values(?,?,?)");
		
		// rollno | name | dob
		
		pstmt.setInt(1, Integer.parseInt(args[0]));
		pstmt.setString(2, args[1]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		java.util.Date d1 = sdf.parse(args[2]);
		java.sql.Date d2=new java.sql.Date(d1.getTime());
		pstmt.setDate(3, d2);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	System.out.println("Change date formate Successfull.....!");
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
