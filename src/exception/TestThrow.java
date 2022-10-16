package exception;

public class TestThrow {
	public static void CheckNum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("\nNumber is negative");
			
		}
		else
		{
			System.out.println("square of:"+num+"is"+(num*num));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrow tt=new TestThrow();
		tt.CheckNum(7);
		System.out.println("rest of the code");

	}

}
