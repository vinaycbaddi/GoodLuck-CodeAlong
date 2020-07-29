package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","vinay");
		if(con!=null) {
			System.out.println("Established");
		}
		return con;
	}
}
