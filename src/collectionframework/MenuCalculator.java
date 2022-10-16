package collectionframework;
import java.util.Scanner;


public class MenuCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		int choice,condition;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("Menu Calculator");
			System.out.println("Press 1 for addition");
			System.out.println("press 2 for subtraction");
			System.out.println("press 3 for multiplication");
			System.out.println("press 4 for division");
			
			choice=s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the 1st value:");
				a=s.nextDouble();
				System.out.println("Enter the 2nd value:");
				b=s.nextDouble();
				c=a+b;
				System.out.println("addition of 2 numbers is:"+c);
				break;
				
			case 2:
				System.out.println("Enter the 1st value:");
				a=s.nextDouble();
				System.out.println("Enter the 2nd value:");
				b=s.nextDouble();
				c=a-b;
				System.out.println("subtraction  of 2 numbers is:"+c);
				break;
				
			case 3:
				System.out.println("Enter the 1st value:");
				a=s.nextDouble();
				System.out.println("Enter the 2nd value:");
				b=s.nextDouble();
				c=a*b;
				System.out.println("multiplication of 2 numbers is:"+c);
				break;
				
			case 4:
				System.out.println("Enter the 1st value:");
				a=s.nextDouble();
				System.out.println("Enter the 2nd value:");
				b=s.nextDouble();
				c=a/b;
				System.out.println("Division of 2 numbers is:"+c);
				break;
			case 5:
				System.exit(0);
				default:
				
				
			}
			
			
		}while(choice==1);
		
		

	}

}
