package MiniProjects.LibraryManagementSystem;

// SINGLETON-CLASS :=>	
//In object-oriented programming, 
//a singleton class is a class that can have only one 
//object (an instance of the class) at a time.

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection 
{
	private static Connection connection = null;
	public static Connection getConnection(String dbname) throws Exception
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String con = "jdbc:mysql://localhost:3307/"+dbname;
		final String user = "root";
		final String pswd = "root";
		
		Class.forName(forName);
		
		connection = DriverManager.getConnection(con,user,pswd);
		
		return connection;		
	}

}
