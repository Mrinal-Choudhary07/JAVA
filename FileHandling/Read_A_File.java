package com.FileHandling;

import java.io.File;
import java.util.Scanner;

public class Read_A_File 
{
	public static void main(String[] args) 
	{
		try
		{
			File file = new File("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\FileHandling\\CreatedFiles\\Sample.txt");
			Scanner sc = new Scanner(file);	
			
			while( sc.hasNext() )
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			System.out.println( "\n-------------------" );
			System.out.println( "Reading is done!!!" );
			System.out.println( "-------------------" );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
