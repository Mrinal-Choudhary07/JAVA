package com.MySQLDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Transactions enable you to control if, and when,
 *  changes are applied to the database. It treats a 
 *  single SQL statement or a group of SQL statements 
 *  as one logical unit, and if any statement fails, 
 *  the whole transaction fails.
 * */

public class Transcation {
	private static Connection connection;

	public static void main(String[] args) {
		try {
			connection = CreateConnection.getConnection();
			
			// commit for transactions
			
			connection.setAutoCommit(false);
			
			PreparedStatement ps = connection.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, 6);
			ps.setString(2, "Himan");
			ps.executeUpdate();
			
			// here we did a mistake which will throw an exception
			ps = connection.prepareStatement("inserted into student values(?,?)");
			ps.setInt(1, 7);
			ps.setString(2, "Akshat");
			ps.executeUpdate();			
			
			// if there is no error commit it
			connection.commit();	
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				// it will rollback every executed queries before error caught
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
