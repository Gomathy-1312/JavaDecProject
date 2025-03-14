package day3;

public class Switchcaseex {

	public static void main(String[] args) {

//		switch(variable)
//		{
//		case "value1"  :  statements;
//						      break;
//
//		case "value2: statements;
//							break;
//		---
//		---
//		---
//		default : statments;
//		}

		int a = 10;

		switch (a = 8) {
		case 1:
			System.out.println("Sunday");break;
		case 2:
			System.out.println("Monday");break;
		case 3:
			System.out.println("Tuesday");break;
		case 4:
			System.out.println("Wednesday");break;
		case 5:
			System.out.println("Thursday");break;
		case 6:
			System.out.println("Friday");break;
		case 7:
			System.out.println("Saturday");break;
		default:
			System.out.println("Nothing to print");break;

		}

	}

}
