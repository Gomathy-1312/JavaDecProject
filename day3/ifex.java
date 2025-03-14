package day3;

public class ifex {

	public static void main(String[] args) {

//		
//		if
//		----------
//		if()
//		{
//		statemetns;
//		}

		if (true) {

			if (true) {

				if (false) {

					System.out.println("Condition passed");

				} else {

					System.out.println("Condition failed  1");

				}

			} else {

				System.out.println("Outer loop");

			}

		} else {

			System.out.println("Condition failed");

		}

	}

}
