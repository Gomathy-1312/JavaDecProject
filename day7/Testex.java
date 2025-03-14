package day7;

public  class Testex implements Concept_Interface,Childex {
	
	
	@Override
	public void A() {
		
		System.out.println("kjdhcjsk");
		
	}

	@Override
	public void m1() {
		System.out.println("jdjjkad");
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Testex tt = new Testex();
		Concept_Interface cc = new Testex();
		tt.A();
		tt.m1();
		tt.m2();
		Concept_Interface.m3();
		
		
		
	}

	

}
