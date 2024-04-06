package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DortExample {

	public static void main(String[] args) {
		List<Integer> numbers =new ArrayList<>();
		numbers.add(12);
		numbers.add(1);
		numbers.add(9);
		numbers.add(6);
		
		Collections.sort(numbers);
		
		System.out.println("sorted numbers are "+numbers);
		

	}

}
