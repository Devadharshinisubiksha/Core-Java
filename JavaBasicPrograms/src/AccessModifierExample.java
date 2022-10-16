class ParentClass{
int a=10;
public int b=20;
protected int c=30;
private int d=40;
void showData() {
	System.out.println( "Inside parentclass");
	System.out.println( "a="+a);
	System.out.println( "b="+b);
	System.out.println( "c="+c);
	System.out.println( "d="+d);
}
	}
class ChildClass extends ParentClass{
	void accessData() {
		System.out.println( "Inside Childclass");
		System.out.println( "a="+a);
		System.out.println( "b="+b);
		System.out.println( "c="+c);
		//System.out.println( "d="+d);
	}
}
public class AccessModifierExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.showData();
		obj.accessData();
	}
}