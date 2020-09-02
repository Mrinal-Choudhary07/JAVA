package com.FileHandling;

import java.io.File;

public class Delete_A_File 
{
	public static void main(String[] args) 
	{
		File file = new File("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\FileHandling\\CreatedFiles\\Sample.txt");
		
		if( file.delete() )
		{
			System.out.println("File name '"+file.getName()+"' is deleted.");			
		}
		else
		{
			System.out.println("File name '"+file.getName()+"' does not exist.");			
		}				
	}
}
