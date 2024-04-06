package com.development;

import java.util.StringTokenizer;


//import java.util.*;

//import java.util.StringTokenizer;

public class SimpleOperations {

	
	public int Addition(int x,int y)
	{
		return x+y;
	}
	public int FindMin(int x[])
	{
	int min=x[0];
	for(int i=0;i<x.length;i++)
	{
		if(min>x[i])
			min=x[i];
	}
	return min;
	}
	 public static String reverseWord(String str){  
		  
	        StringBuilder result=new StringBuilder(); 
	        
	       // StringTokenizer tokenizer=new StringTokenizer(str," ");  
	        StringTokenizer tokenizer=new StringTokenizer(str,"");
	        
	        while(tokenizer.hasMoreTokens()){  
	        StringBuilder sb=new StringBuilder();  
	        sb.append(tokenizer.nextToken());  
	        sb.reverse();  
	        result.append(sb);
	        }  
	        return result.toString();  
	 }
	 
	 public void Divide(int n)
	 {
		int div=n/0; 
	 }
	 
	 public void TestTime()
	 {
		 for(int i=1;i<=100000;i++)
		 {
			System.out.println(i+"LP"); 
		 }
			 
	 }
}

	
	
	

