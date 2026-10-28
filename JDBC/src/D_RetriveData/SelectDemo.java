package D_RetriveData;

import java.sql.*;
public class SelectDemo {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/vinay", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		ResultSetMetaData rm=rs.getMetaData();
		int n =rm.getColumnCount();
		for(int i=1;i<=n;i++) {
			System.out.print(rm.getColumnName(i)+"	");
		}
		System.out.println();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"	");
			System.out.print(rs.getString(2)+"	");
			System.out.println(rs.getInt(3)+" ");
			
		}
		
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
