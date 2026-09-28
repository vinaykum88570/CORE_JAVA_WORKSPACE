package T_Streams;

import java.sql.*;
import java.io.*;

public class Read_Insert_Record {
public static void main(String[] args) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay","root","root");
	
	
	
	String Sql = "Insert into student values(?,?,?,?)";
	PreparedStatement pstmt = con.prepareStatement(Sql);
	
	BufferedReader reader = new BufferedReader(new FileReader("C:\\my movies\\Student.txt"));
	reader.readLine();
	pstmt.setInt(1, 1);
	pstmt.setString(2, "name");
	pstmt.setString(3, "surname");
	pstmt.setString(4,"city");
	pstmt.executeUpdate();
	System.out.println("Record Inserted ");
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
