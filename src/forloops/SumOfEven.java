package forloops;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,N,sum = 0; 
		System.out.println("Enter the value of N");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		 
		for(i=2 ; i<N; i+=2) 
		{
			sum+=i;
		
		System.out.println("Sum of N even numbers is : "+sum); 

	}

}
}
