package com.MySQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Table 
{
	public static void main(String[] args) throws Exception 
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String connection = "jdbc:mysql://localhost:3307/demomysql";
		final String user = "root";
		final String pswd = "3588";				
		
		Class.forName(forName);
		
		Connection con = DriverManager.getConnection( connection , user , pswd );
		
		Statement stmt = con.createStatement();	
		
		String createQuery = "create table student(roll int(2) , name varchar(20) )";
		
		int check = stmt.executeUpdate(createQuery);
		
		System.out.println( ( check == 0 ) ? "Table is created." : "Error" );
	}
}
