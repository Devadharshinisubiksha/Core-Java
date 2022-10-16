package ConstructorEx;
public class SuperMethod extends SuperClass {
	public SuperMethod() {
	super("Java");
	}
	public static void main(String[] args) {
	SuperMethod superMethod = new SuperMethod();
	
	} }
	class SuperClass {
	SuperClass(String name) {
	System.out.println("This constructor received nameargument " + name);
	
	}

}
