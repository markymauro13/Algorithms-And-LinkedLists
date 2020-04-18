//*********************************************************************************
// Author: Mark Mauro
//
// Section: 02
//
// Solution to PP 13.3
//*********************************************************************************

import java.util.Random;

public class LinkedListAlgorithms {
	
	static final int MAX_NUMBERS = 25;
	static final int MAX_INT_VALUE = 100;
	
	public static void main(String[] args) {
		
		Random gen = new Random();
		SelectionSort sort = new SelectionSort();
		InsertionSort sort2 = new InsertionSort();
		
		int numInts = gen.nextInt(MAX_NUMBERS) + 1;
		
		System.out.println("Selection Sort: \n");
		System.out.println("Generated " + numInts +" integers:");
		
		for(int i = 0; i < numInts; i++) 
			sort.add(gen.nextInt(MAX_INT_VALUE));
		
		System.out.println(sort); // unsorted
		
		sort.sort();
		
		System.out.println("Sorted:");
		System.out.println(sort);
		
		System.out.println();
		System.out.println("Insertion Sort: \n");
		System.out.println("Generated " + numInts +" integers:");
		
		for(int i = 0; i < numInts; i++) 
			sort2.add2(gen.nextInt(MAX_INT_VALUE));
		
		System.out.println(sort2); // unsorted
		
		sort2.sort2();
		
		System.out.println("Sorted:");
		System.out.println(sort2);
	}
	
}
