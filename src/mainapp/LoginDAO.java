package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		String username=loginpojo.getUsername();
		String password=loginpojo.getPassword();
		ConnectionManager con= new ConnectionManager();
		Statement st= con.getConnection().createStatement();
		ResultSet rs= st.executeQuery("select * from USERDETAILS");
		while(rs.next()) {
			if(username.equals(rs.getString(3)) && password.equals(rs.getString(4))) {
				con.getConnection().close();
				return true;
			}
			else {
				con.getConnection().close();
				return false;
			}
		}
		return false;
		
	}

}
