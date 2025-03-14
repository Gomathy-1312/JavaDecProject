package day7;

public class Wrapperclassex {

	public static void main(String[] args) {

		// primitive data type

		byte  b = 10;           
		short	sh = 20;	  
		int		i = 100;  
		long	l = 10000;	  
		float	f = 10.2f;	 
		double	d=100000.0;	 
		char	ch='A';	
		boolean	boo = true;	

		
		// object
		
		Byte  by =b;
	    Short shh=sh;
		Integer Int=i;
		Long loo=l;
		Float  fll=f;
		Double   Dooo=d;
	    Character chkkk=ch;
		Boolean ble=boo;
		
		
	//	Object to primitive
		byte  b1 =  by  ;       
		short	sh1 = shh;	  
		int		i1= Int;  
		long	l1 = loo;	  
		float	f1 = fll;	 
		double	d1=Dooo;	 
		char	ch1=chkkk;	
		boolean	boo1 = ble;	
		
		System.out.println(b1);
		
		// converting string to int
		
		String s="10";
		
		int num=Integer.parseInt(s);
		
		
		System.out.println(num);
		
		
		// Convert int to string
		
		int num1 = 100;
		
		String value=String.valueOf(num1);
		
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
