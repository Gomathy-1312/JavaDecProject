package day8;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetex {

	public static void main(String[] args) {


		HashSet<Object> hh = new HashSet<Object>();
		
		hh.add("Ramesh");
		hh.add(100);
		hh.add(true);
		hh.add(null);
		hh.add(null);
		
		System.out.println(hh);
		
		//Convert hashset to arraylist
		
		ArrayList<Object> arr = new ArrayList<Object>(hh);
		
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
