package A_Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
	System.out.println(con);
}
}
