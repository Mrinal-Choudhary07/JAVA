package com.FileHandling;

import java.io.File;
import java.io.FileWriter;

public class Write_In_File 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter file = new FileWriter("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\FileHandling\\CreatedFiles\\Sample.txt");
			file.write("Welcome to java");
			file.close();// must write
			System.out.println("File name with Sample.txt has been updated. ");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}