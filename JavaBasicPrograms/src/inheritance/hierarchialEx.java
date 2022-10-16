package inheritance;
class Animal
{
	void eat()
	{
		System.out.println("eating..");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("mewing..");
	}


}

public class hierarchialEx {
	public static void main(String[] args) {
		
		   Cat c=new Cat();
		        c.meow();
		         c.eat();
		         Dog d=new Dog();
		         d.bark();
	}
}