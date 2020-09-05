package MiniProjects.Todo_List;

// SINGLETON-CLASS :=>	
//In object-oriented programming, 
//a singleton class is a class that can have only one 
//object (an instance of the class) at a time.

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection 
{
	private static Connection connection = null;
	public static Connection getConnection() throws Exception
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String con = "jdbc:mysql://localhost:3307/todolist";
		final String user = "root";
		final String pswd = "3588";
		
		Class.forName(forName);
		
		connection = DriverManager.getConnection(con,user,pswd);
		
		return connection;		
	}

}
