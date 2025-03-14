package day1;

import day7.child;

public class OOPsex extends child{

	void gomathy() {

		System.out.println("Method above main");

	}

	public static void main(String[] args) {

		OOPsex oo = new OOPsex(); // Object creation
oo.m1();
		
		oo.gomathy();

		System.out.println("Welcome to java");

	}

}
