package com.MySQLDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * LIKE CLAUSE:->
 * WHERE CustomerName LIKE 'a%'	  Finds any values that start with "a"
   WHERE CustomerName LIKE '%a'	  Finds any values that end with "a"
   WHERE CustomerName LIKE '%or%' Finds any values that have "or" in any position
   WHERE CustomerName LIKE '_r%'  Finds any values that have "r" in the second position
   WHERE CustomerName LIKE 'a_%'  Finds any values that start with "a" and are at least 2 characters in length
   WHERE CustomerName LIKE 'a__%' Finds any values that start with "a" and are at least 3 characters in length
   WHERE ContactName LIKE 'a%o'	  Finds any values that start with "a" and ends with "o"
 */

public class Where_and_Like_Clauses {

	private static Connection connection;

	public static void main(String[] args) {

		try {
			connection = CreateConnection.getConnection();

			// WHERE CLAUSE =>
			System.out.println(" WHERE CLAUSE:- ");
			PreparedStatement ps = connection.prepareStatement("select * from student WHERE roll = ?");
			ps.setInt(1, 9);

			ResultSet result = ps.executeQuery();

			while (result.next()) {
				System.out.println(result.getString("name"));
			}

			// LIKE CLAUSE =>
			System.out.println(" LIKE CLAUSE:- ");
			ps = connection.prepareStatement(" select * from student WHERE name LIKE 'a%' ");
			result = ps.executeQuery();

			while (result.next()) {
				System.out.println(result.getString("name"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
