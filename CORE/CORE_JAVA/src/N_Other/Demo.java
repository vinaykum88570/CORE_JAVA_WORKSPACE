package N_Other;

import java.sql.DriverManager;
import java.sql.*;

//	 java.lang.RuntimeException;
 
public class Demo{	
	
	public static void main(String[] args)  {
		try {
		Class c =Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@axe","system","manager");	
		System.out.println("Connection Established Successfull....... ");
		}catch(ClassNotFoundException | SQLException  e){
			e.printStackTrace();
		}
	}
}