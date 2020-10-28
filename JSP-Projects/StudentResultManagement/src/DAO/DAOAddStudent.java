package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOAddStudent {

	private static Connection connection;
	private static String query;
	private static int check;

	public static boolean insertIntoAddStudent(ArrayList<String> val) {

		connection = CreateConnection.getConnection();
		query = "insert into addStudent values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			int i = 1;
			ps.setInt(1, Integer.valueOf(val.get(0)));
			while (i < val.size()) {				
				ps.setString((i+1), val.get(i));
				i++;
			}
			check = ps.executeUpdate();
			System.out.println( (check == 1) ? "Inserted": "Error" );
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return (check==1) ? true : false;
	}

}
