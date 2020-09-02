package com.MySQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_In_Table 
{
	public static void main(String[] args) throws Exception 
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String connection = "jdbc:mysql://localhost:3307/demomysql";
		final String user = "root";
		final String pswd = "3588";
		
		Class.forName(forName);
		
		Connection con = DriverManager.getConnection(connection,user,pswd);
		
		Statement stmt = con.createStatement();
		
		int check = stmt.executeUpdate(" delete from student where roll = '4' ");
		
		System.out.println( (check == 1) ? "Deleted Succesfully" : "ERROR" );		
	}
}
