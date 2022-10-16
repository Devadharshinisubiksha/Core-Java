
public class Swapping {
int x,z;
	
	// call by reference
	
	void swap(Swapping s)
	{
		int a;
		
		a = s.x;
		s.x = s.z;
		s.z = a;		
	}
	
	
	public static void main(String... g)
	{
		Swapping obj = new Swapping();
		obj.x=90;
		obj.z=78;
		
		System.out.println("Before Swapping  \n");
		System.out.println("X: "+obj.x);
		System.out.println("Z: "+obj.z);
		
		obj.swap(obj);
		
		System.out.println("After Swapping  \n");
		System.out.println("X: "+obj.x);
		System.out.println("Z: "+obj.z);
		
		

}
}
