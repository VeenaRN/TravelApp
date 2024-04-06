package com.iostreams;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File3 {

	public static void main(String[] args) throws IOException {
	Scanner sca=new Scanner(System.in);

	
	FileWriter fw=new FileWriter("C:\\filedata\\test.txt",true);
	
	System.out.println("Enter text ");
	String str=sca.nextLine();
	
	str=str+"\n";
	fw.write(str);
	
	System.out.println("file created");
	
	
	fw.close();
			
		
	}

}
