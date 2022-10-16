import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.name="Subiksha";
		e.address="Paris";
		try {
			FileOutputStream fo=new FileOutputStream("D:\\employee.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(e);
			os.close();
			fo.close();
			System.out.println("Serialized data is saved in D:\\employee.txt");	
		}catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
