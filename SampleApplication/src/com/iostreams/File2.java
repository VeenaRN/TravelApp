package com.iostreams;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class File2 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		//Scanner sca=new Scanner(System.in);
		FileInputStream fis=new FileInputStream("C:\\filedata\\file1.txt" );
		
	int ch=fis.read();
	
	while(ch!=-1)
	{
	System.out.print((char)ch);
	ch=fis.read();
	}
	 
	fis.close();
	}
}
