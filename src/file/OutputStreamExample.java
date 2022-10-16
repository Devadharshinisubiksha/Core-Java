package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os=new FileOutputStream("D:\\JAVA\\test.txt");
			os.write(70);
			os.write(71);
			os.write(72);
			os.close();
			System.out.println("Successfully created and written the file.");
		}catch(IOException e) {
			System.out.println("Exception");
		}

	}

}
