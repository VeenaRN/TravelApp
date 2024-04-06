package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample2 {

	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		
		str.add("home");
		str.add("alice");
		str.add("bob");
		str.add("charlie");
		
		Collections.sort(str);
		System.out.println("sordet strings are" +str);
		

	}

}
