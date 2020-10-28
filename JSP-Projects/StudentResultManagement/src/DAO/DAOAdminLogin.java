package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOAdminLogin {

	private static Connection connection;

	public static boolean check( String u , String p ) {
		String user = null;
		String pass = null;
		try {
			connection = CreateConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("select user , pass from adminlogin");
			ResultSet set = ps.executeQuery();

			set.next();

			user = set.getString(1);
			pass = set.getString(2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return (user.equals(u) && pass.equals(p))?true : false ;
	}

}
