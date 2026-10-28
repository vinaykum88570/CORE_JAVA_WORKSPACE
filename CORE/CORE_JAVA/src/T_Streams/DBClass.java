package T_Streams;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBClass {
public static void main(String[] args) throws IOException , ClassNotFoundException ,SQLException {
	try {
		Driver.class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vinay","root","root");
		System.out.println("Inserted");
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\my movies\\Student.txt"));
		PreparedStatement pstmt = con.prepareStatement("insert into studentdata values(?,?,?,?)");
		
		for(int i=1;i<=3;i++) {
			//insert into studentdata (rollno ,stuname,stusurname,city )
			//values(101, 'vinay' , 'kumdale', 'kalka');
		   	String line = reader.readLine();
		   	
		   String [] newLine =line.split(" "); 
		   
			System.out.println(newLine[0]+" "+newLine[1]+" "+newLine[2]+" "+newLine[3]);
			
			pstmt.setInt(1,Integer.parseInt(newLine[0]));
			pstmt.setString(2,newLine[1]);
			pstmt.setString(3,newLine[2]);
			pstmt.setString(4,newLine[3]);
			
			pstmt.executeUpdate();
		}
		
		
		System.out.println("Data Inserted Successflly........!");

	}catch(FileNotFoundException  e) {
		e.printStackTrace();
	}
}
}
