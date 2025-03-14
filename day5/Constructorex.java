package day5;

public class Constructorex {

	Constructorex() {
System.out.println("non parameterized constructor");
		
	}

	Constructorex(String name) {
		System.out.println("parameterized constructor:" +" "+name);
	}

	Constructorex(int num) {
		System.out.println("parameterized constructor:"+" "+num);
	}

	Constructorex(char a) {
		System.out.println("parameterized constructor:"+"  "+a);
	}

	public static void main(String[] args) {

		Constructorex ex = new Constructorex();
		Constructorex ex1 = new Constructorex("Ramesh");
		Constructorex ex2 = new Constructorex(100);
		Constructorex ex3 = new Constructorex('A');
		
		
		
		
	}

}
