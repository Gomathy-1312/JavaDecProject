package day4;

public class Stringex {

	public static void main(String[] args) {


		String s1="Welcome";
		String s2="welcome";
		
//		// length
//		
//		System.out.println(s1.length());
//		
//		
//		 //Concat();
//		
//		
//		System.out.println(s1+s2);
//		
//		String s3=s1+s2;
//		
//		
//		System.out.println(s3.length());
//		
//		
//		// Trim
//		
//		System.out.println(s1.length());
//		
		System.out.println(s1.trim().length());//7
		
		System.out.println(s1.length());//8
		
		 //CharAt();
		
		System.out.println(s1.charAt(3));
		
		//Contains()
		
		System.out.println(s1.contains("e"));
		
		
		//equals()
		  
		System.out.println(s1.equals(s2));
		
		 // equalignorecase
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
	//  Replace();
		
		System.out.println(s1.replace("e", "x"));
		
		//Split
		
		String str ="gomathyk@gmail.com";
		
		String[] ss=str.split("@");
		
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		
		//touppercase
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

	}

}
