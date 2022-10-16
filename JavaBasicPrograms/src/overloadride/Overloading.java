package overloadride;
public class Overloading{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[]args) {
		Overloading ol=new Overloading();
		ol.sum(25, 10);
		ol.sum(25, 66, 22);
		
	}
}