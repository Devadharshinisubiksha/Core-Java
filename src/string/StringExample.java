package string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("This is a Java Program");
		System.out.println("Length : "+str.length());
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(4, 18));
		
		
		String str1= new String("and this is a secure language.");
		
		System.out.println(str.concat(str1));
		
		str = str.concat(str1);
		
		System.out.println(str);
		
	    System.out.println(str.charAt(18));
		
	    System.out.println("Length : "+str.length());
	    
	    System.out.println(str.contains("secure"));
	    System.out.println(str1.indexOf("secure"));
	  
	    String st = String.valueOf(9898);
	    System.out.println(st);
		
	    
	   // String str2= new String("This is a Java Program");
	  //  System.out.println("Compare strings : "+ str.compareTo(str2));
	    	

	}

}
