package string;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java"; // reference variable
		String str1=new String("Java"); //object/instance of class
		
		
		//	by using == or equals()
		if (str==str1)
			System.out.println("Both values are equal");
		else
			System.out.println("Both values are not equal");
		
		
		if (str.equals(str1))
			System.out.println("both values are equal");
		else
			System.out.println("Both values are not equal");
		String str11 ="testing";
		String str22 ="TEST";
		
		
		//String str3="Testing";
		
			
		int h = str11.compareToIgnoreCase(str22);

		if (h==0)
		{
			System.out.println("Equals");	
		}
		else if( h > 0) 
		{
			System.out.println("String 1 is greater");		
		}
		else
		{		
			System.out.println("String 2 is greater");	
		}
		
		
		System.out.println(h==0?"Equals":(h>0?"String1":"String2"));
		
		
		
	    }
	


	}


