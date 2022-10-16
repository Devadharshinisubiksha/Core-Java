package exception;

class UserDefinedAgeException  extends Exception
{
	String str;
	
	public String toString()
	{
		return this.str;	
	}
	
	UserDefinedAgeException(){}
	
	UserDefinedAgeException(String s)
	{
		this.str = s;
	}
	
	void checkAge(int a) throws UserDefinedAgeException
	{	
		String st;
		if((a>=1) && (a<=10))				
				st = "Kids...";		
		else if( a>=11 && a<=18 )
				st="Child...";
		else
				st="Valid Voter !";
		
		throw new UserDefinedAgeException(st);		
	}	
}




public class Exception3 {

	public static void main(String[] args) {
		UserDefinedAgeException obj=new UserDefinedAgeException();
		try
		{
			obj.checkAge(25);
		}
		catch(UserDefinedAgeException e)
		{
			System.out.println("Exception Msg:"+e);
		}
		

	}

}

