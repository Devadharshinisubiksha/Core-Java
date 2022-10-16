import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=null;
		try {
			FileInputStream fo=new FileInputStream("D:\\employee.txt");
			ObjectInputStream os=new ObjectInputStream(fo);
			e=(Employee)os.readObject();
			os.close();
		}catch(IOException i)
		{
			i.printStackTrace();
			return;
		}catch(ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("name:"+e.name);
		System.out.println("address:"+e.address);

	}

}
