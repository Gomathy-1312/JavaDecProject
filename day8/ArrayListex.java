package day8;

import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {


		ArrayList<Object> arr = new ArrayList<Object>();
		
		arr.add(10);
		arr.add("Arun");
		arr.add('A');
		arr.add('A');
		arr.add(null);
		arr.add(null);
		
		
		System.out.println(arr.size());//6
		
		System.out.println(arr.get(3));//A
		System.out.println(arr);
		
		System.out.println(arr.remove(4));
		
		System.out.println(arr);
		
	arr.add(1, "Mohan");
	
	System.out.println(arr);
	
	arr.set(1, "Ramesh");
	System.out.println(arr);
	
	for(int i=0;i<arr.size();i++) {
		
		System.out.println(arr.get(i));
		
	}
	
	
	for(Object ar:arr) {
		
		System.out.println(ar);
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
