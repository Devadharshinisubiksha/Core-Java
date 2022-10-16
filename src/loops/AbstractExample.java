package loops;


	abstract class Animal{
		//abstract method
		public abstract void animalSound();
		//regular method
		public void sleep() {
			
		}
		{
			System.out.println("ZZZzzz");
		}
		
	}
	//subclass(inherited from Animal)
	class Pig extends Animal{
		public void animalSound() {
			
		}
		{
			//the body of animal sound
			System.out.println("The pig say: wee wee");
			
		}
	}
	public class AbstractExample{
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pig obj=new Pig();
			obj.sleep();

	}

}
