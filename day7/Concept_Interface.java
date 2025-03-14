package day7;

interface Concept_Interface {

	final static int a = 10;

public	void m1();

public	default void m2() {

	System.out.println("default");
	}

public	static void m3() {

	System.out.println("static");
	}

}