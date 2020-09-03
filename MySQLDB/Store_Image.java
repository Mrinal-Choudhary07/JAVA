package com.MySQLDB;

/*
 * Table for image in mysql
 * 
 * CREATE TABLE  "IMGTABLE"   
   (    "NAME" VARCHAR2(4000),   
        "PHOTO" BLOB  
   )  
   blob(Binary Large Object) is used to store image
 */
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Store_Image 
{
	public static void main(String[] args) throws Exception 
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String connection = "jdbc:mysql://localhost:3307/demomysql";
		final String user = "root";
		final String pswd = "3588";
		
		Class.forName(forName);
		
		Connection con = DriverManager.getConnection(connection,user,pswd);
		
		PreparedStatement pstmt = con.prepareStatement("insert into imagestore values(?,?)");
		pstmt.setInt(1, 101);
		
		FileInputStream fis = new FileInputStream("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\MySQLDB\\logo.png");
		
		pstmt.setBinaryStream(2, fis,fis.available());
		
		int check = pstmt.executeUpdate();
		
		System.out.println( (check == 1) ? "IMAGE INSERTED" : "ERROR" );				
	}
}
