package loops;

class Area
{
//Fields to calculate area
int length;
int breadth;
//constructor to initialise the value
Area(int length,int breadth)
{
this.length=length;
this.breadth=breadth;

}
//method to calculate area
public void getArea()
{
int area=length*breadth;
System.out.println("Area:"+area);
}
}

public class EncapsulationEx {

public static void main(String[] args) {
//create object of area
//pass the value of length and breadth
Area rectangle=new Area(10,6);
rectangle.getArea();

}

}


