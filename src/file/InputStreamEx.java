package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class InputStreamEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f=new File("D:\\JAVA\\test.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("My name is: "+name);
		
		System.out.println("enter your Age: ");
		int age=Integer.parseInt(br.readLine());
		System.out.println("enter your Age: "+age);
		
		System.out.println("enter your percentage: ");
		float percentage=Float.parseFloat(br.readLine());
		System.out.println("Percentage:"+percentage);
				
		
		
		
		
		
		
		

	}

}
