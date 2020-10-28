package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

public class DAOAddResult {

	private static Connection connection;
	private static String query;
	private static String data[] = new String[2];
	private static Hashtable<String, String> hs = new Hashtable<>();

	public static String[] addDataIntoResult(int roll, String[] arr, int sub1, int sub2, int sub3) {

		query = "insert into result values(?,?,?,?,?,?,?)";
		connection = CreateConnection.getConnection();

		hs.put("P", "PHYSICS");
		hs.put("C", "CHEMISRTY");
		hs.put("M", "MATHS");
		hs.put("Cs", "COMPUTER-SCIENCE");
		hs.put("G", "GEOLOGY");
		hs.put("E", "ELECTRONICS");
		hs.put("S", "STATISTICS");

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, roll);
			ps.setString(2, hs.get(arr[0]));
			ps.setInt(3, sub1);
			ps.setString(4, hs.get(arr[1]));
			ps.setInt(5, sub2);
			ps.setString(6, hs.get(arr[2]));
			ps.setInt(7, sub3);

			int check = ps.executeUpdate();

			System.out.println((check == 1) ? "Result Inserted" : "Error ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}

}
