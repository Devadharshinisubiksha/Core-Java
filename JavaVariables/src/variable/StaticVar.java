package variable;
 class Student{
	 public static double fees;
	 public static String name="subiksha";
}
public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.fees=10000.90;
		System.out.println(Student.name +"Student fees:"+Student.fees);

	}

}
