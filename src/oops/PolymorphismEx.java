package oops;

import oops.Polygon.Circle;
import oops.Polygon.Square;

class Polygon{
	public void render() {
		System.out.println("Rendering Polygon");
	}
	class Square extends Polygon{
		public void render()
		{
			System.out.println("Rendering Square");
		}
	}
	class Circle extends Polygon
	{
		public void render() {
			System.out.println("Rendering Circle");
		}
		
	}
	

public class PolymorphismEx 
{
	
	public void main(String []args) {
		//dynamic binding
		Circle c1=new Circle();
		c1.render();
		Square s1=new Square();
		s1.render();
		//static binding
		Polygon p1=new Polygon();
		p1.render();
	}
		
	

}
}
