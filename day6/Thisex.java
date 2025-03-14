package day6;

public class Thisex {
	
	int a;// class variable
	
	void m1(int a) {// local variable
		
		this.a=a;
		System.out.println(a);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		Thisex tt = new Thisex();
		tt.m1(20);
		
		

	}

}
