package com.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class File1 {
	
	public static void main(String[] args) throws IOException {
	Scanner sca=new Scanner(System.in);
	
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
	LocalDateTime now=LocalDateTime.now();
	String fname=dtf.format(now)+".txt";
	
	FileOutputStream fos=new FileOutputStream("C:\\filedata\\" +fname);
	
	System.out.println("Enter text ");
	String str=sca.nextLine();
	
	byte[] arr=str.getBytes();
	
	fos.write(arr);
	
	System.out.println("file created");
	
	fos.close();
		

}
}