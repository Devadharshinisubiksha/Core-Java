package ConstructorEx;

public class Main {
	String StudentName;
	int StudentAge;
	//constructor
	Main(String name,int age){
		StudentName=name;
		StudentAge=age;
		age=30;
	}
	void display() {
		System.out.println(StudentName+" "+StudentAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main myobj=new Main("Manan",50);
		myobj.display();

	}

}
