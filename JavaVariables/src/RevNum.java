
public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 1234, r=0;
		    while(num != 0) {
		      int digit = num % 10;
		      r = r * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: "+r);

	}

}
