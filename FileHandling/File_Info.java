package com.FileHandling;

import java.io.File;

public class File_Info 
{
	public static void main(String[] args) 
	{
		File file = new File("E:\\Programming\\Eclipse\\com.JAVA\\src\\com\\FileHandling\\CreatedFiles\\Sample.txt");
		
		if( file.exists() )
		{
			System.out.println("Length of File => "+file.length() );
			System.out.println("Is File => "+file.isFile() );
			System.out.println("Is Directory => "+file.isDirectory() );
			System.out.println("File name => "+file.getName() );
			System.out.println("File Path => "+file.getPath() );
			System.out.println("File Absolte Path => "+file.getAbsolutePath() );
			System.out.println("File exists => "+file.exists() );
			System.out.println("Can we write in a File => "+file.canWrite() );
			System.out.println("Can we read a File => "+file.canRead() );
			System.out.println("File is hidden => "+file.isHidden() );
			System.out.println("When we last modified File => "+file.lastModified() );
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
}
