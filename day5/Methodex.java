package day5;

public class Methodex {
	
	
	void m1() {
		
		System.out.println("1) No Params   No return value");
		
	}
	
	String m2() {
		System.out.println("2) No Params   Return value");
		return "John";
		
		
	}
	
	
	void m3(String name) {
		
		System.out.println("3) Take params  No Return:" +" "+name);
		
	}
	
	String m4(String flowername, int num) {
		
		System.out.println("4) Take params  Return a value:"+ "   "+flowername +" "+num);
		return "Country_name";
		
	}
	
	

	public static void main(String[] args) {

		Methodex mx = new Methodex();
		mx.m1();
		String empname=mx.m2();
		System.out.println(empname);
		mx.m3("Ramesh");
		mx.m4("Rose", 20);
		
		
		
		
		

	}

}
