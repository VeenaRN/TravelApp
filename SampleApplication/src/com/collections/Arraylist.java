package com.collections;

import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		List<String> lstStr=new ArrayList<String>();
		lstStr.add("Veena");//added statically
		lstStr.add("Mallika");
		lstStr.add("Bhavya");
		lstStr.add("Pavithra");
		lstStr.add("Veena");
		
		System.out.println(lstStr);//normal printing
		System.out.println("------------------------");
		for(String str:lstStr)//using for loop
		{
			System.out.println(str);
		}
		System.out.println("---------------");
		Iterator itr=lstStr.iterator();//printing using iterator
		
		while(itr.hasNext())//checks wheather value is there next 
		{
			System.out.println(itr.next());//returns value under pointer
		}

	}

}
