package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	
	private static Connection connection = null;
	private final static String forName = "com.mysql.cj.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3307/SRMS";
	private final static String user = "root";
	private final static String pswd = "root";
	
	public static Connection getConnection()
	{
		try {
			Class.forName(forName);
			connection = DriverManager.getConnection(url,user,pswd);
			
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return connection;
	}
}
