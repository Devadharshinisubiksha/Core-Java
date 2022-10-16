package variable;
class Marks{
	//instance variable
	int Tamil;
	int English;
	int Science;
	
}

public class InstanceVar {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mark of student1
		Marks s1=new Marks();
		s1.Tamil=89;
		s1.English=86;
		s1.Science=96;
		
		//mark of student2
		Marks s2=new Marks();
		s2.Tamil=98;
		s2.English=96;
		s2.Science=99;
		
		//displaying marks of student1
		
		System.out.println("Mark of student1");
		System.out.println(s1.Tamil);
		System.out.println(s1.English);
		System.out.println(s1.Science);
		
		//displaying mrks of student2
		
		System.out.println("Mark of student2");
		System.out.println(s2.Tamil);
		System.out.println(s2.English);
		System.out.println(s2.Science);
		
		

	}

}
