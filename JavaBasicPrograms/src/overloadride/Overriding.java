package overloadride;
public class Overriding{
	void run()
	{
		System.out.println("overriding is working");
	}
	static class Sub extends Overriding{
		public static void main(String[]args) {
			Overriding or=new Overriding();
			or.run();	
		}		
	}
}

