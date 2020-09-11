package com.MySQLDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sorting_TableData {
	private static Connection connection;

	public static void main(String[] args) {
		
		try {
			connection = CreateConnection.getConnection();
			PreparedStatement ps = connection.prepareStatement("select * from student ORDER by name ASC");
			ResultSet result = ps.executeQuery();
			
			// ORDER BY COLOUMN name
			while(result.next()) {
				System.out.println( result.getInt("roll")+" "+result.getString("name") );								
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
