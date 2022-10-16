
public class FinalizedMethod {
	public static void main(String[]args) {
		
	  finalizeMethod str2 = new finalizeMethod ();
	  str2 = null;
	       
	        System.gc();
	        System.out.println("output of main method");

	    }
	    
	    protected void finalize()
	    {
	        System.out.println("output of finalize method");
	    }
	
}




