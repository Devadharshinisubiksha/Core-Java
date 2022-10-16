package ConstructorEx;

public class NoArgument {
	int i;
	NoArgument(){
		i=25;
		System.out.println("Creating no argument constructor");
		System.out.println("i="+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArgument na=new NoArgument();

	}

}
