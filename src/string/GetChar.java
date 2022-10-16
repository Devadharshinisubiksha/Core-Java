package string;
import java.util.Arrays;


public class GetChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		char[]dest=new char[4];
		s1.getChars(0,4,dest,0);
		System.out.println(Arrays.toString(dest));
		
		

	}

}
