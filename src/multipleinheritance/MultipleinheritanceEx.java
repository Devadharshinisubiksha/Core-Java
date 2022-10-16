package multipleinheritance;
class Animal implements AnimalEat,AnimalTravel
{
	public void eat()
	{
		System.out.println("animal is eating");
	}
	public void travel()
	{
		System.out.println("animal is travelling");
	}
}
public class MultipleinheritanceEx{
	public static void main(String[]args) {
		Animal a=new Animal();
		a.eat();
		a.travel();
	}
}