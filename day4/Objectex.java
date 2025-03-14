package day4;

public class Objectex {

	public static void main(String[] args) {


		
		
	Object[] ob = new Object[5];
		
		
		ob[0]=100;
		ob[1]='A';
		ob[2]=10.2;
		ob[3]=true;
		ob[4]="Welcome";
		
		System.out.println(ob.length);
		
		for(Object x:ob) {
		
		System.out.println(x);
		

	}

}
}