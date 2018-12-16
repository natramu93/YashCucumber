package execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt", "root", "welcome");
		Statement s= con.createStatement();
		ResultSet rs = s.executeQuery("select * from teststep");
		System.out.println(rs.next());
		rs.next();
		System.out.println(rs.getString(3));
	}

}
