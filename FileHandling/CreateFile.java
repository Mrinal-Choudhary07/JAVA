package com.FileHandling;

import java.io.File;

public class CreateFile 
{
	public static void main(String[] args) 
	{
		try
		{
			File file = new File("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\FileHandling\\CreatedFiles\\Sample.txt");
			
			if(file.createNewFile())
			{
				System.out.println("New file name as Sample.txt is created. ");
			}
			else
			{
				System.out.println("File already exists. ");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}	
}
