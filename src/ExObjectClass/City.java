package ExObjectClass;

public class City {
	
	//declaring class variables
	public String name;
	public long population;
	
	//defining the method of the class
	public void display() {
		System.out.println("city name:"+name);
		System.out.println("population:"+population);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City metro1,metro2;
		
		//instantiate the object of the class using new keyword
		metro1=new City();
		metro2=new City();
		metro1.name="Bangalore";
		metro1.population=235678;
		System.out.println("Details of metro city1:");
		metro1.display();
		
		//display the method
		metro2.name="Mumbai";
		metro1.population=235688;
		System.out.println("Details of metro city2:");
		metro2.display();
	}

}