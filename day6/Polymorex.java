package day6;

public class Polymorex {

	void employee() {
		System.out.println("no params");

	}

	void employee(int a) {
		System.out.println(a);
	}

	void employee(String name, String ename) {
		System.out.println(name + "  " + ename);
	}

	void employee(String name, int a) {
		System.out.println(name + " " + a);
	}

	public static void main(String[] args) {

		Polymorex py = new Polymorex();
		py.employee();
		py.employee(10);
		py.employee("Rajesh", 20);
		py.employee("gshgfj", "dzfhgvbkj");
		
		
		
		

	}

}
