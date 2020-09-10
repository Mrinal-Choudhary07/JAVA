package com.MySQLDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Batch_Queries {
	private static Connection connection;

	public static void main(String[] args) {
		try {
			connection = CreateConnection.getConnection();
			
			//Statement
			Statement s = connection.createStatement();
			s.addBatch("insert into student(roll,name) values(12,'Ali')");
			
			s.addBatch("insert into student(roll,name) values(13,'Alia')");
			
			s.executeBatch();
			
			// Prepared Statement
			PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, 8);
			ps.setString(2, "ABC");

			ps.addBatch();

			ps.setInt(1, 9);
			ps.setString(2, "PQR");

			ps.addBatch();

			ps.executeBatch();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
