package com.MySQLDB;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Blob;

public class Retrieve_Image 
{
	public static void main(String[] args) throws Exception 
	{
		final String forName = "com.mysql.cj.jdbc.Driver";
		final String connection = "jdbc:mysql://localhost:3307/demomysql";
		final String user = "root";
		final String pswd = "3588";
		
		Class.forName(forName);
		
		Connection con = DriverManager.getConnection(connection,user,pswd);
		
		PreparedStatement pstmt = con.prepareStatement("select * from imagestore");
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()){//now on 1st row  
            
			Blob b = (Blob) rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\MySQLDB\\sample.jpg");  
			fout.write(barr);
		}
	}
}
