public  class  Learner{
	int rollno;
	String name;
	static String institution="EDUBRIDGE";
	Learner(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+"  "+name+"  "+institution);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner l1=new Learner(123, "Devadharshini");
		Learner l2=new Learner(456, "subiksha");
		l1.display();
		l2.display();
		}
	}