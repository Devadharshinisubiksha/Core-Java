package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f=new FileInputStream("D:\\JAVA\\test.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(f));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			}
		catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
