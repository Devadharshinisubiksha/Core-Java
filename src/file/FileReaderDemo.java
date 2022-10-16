package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fr= new FileInputStream("D:\\JAVA\\test.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fr));
		int i;
		while((i=br.read())!=-1) 
		{
			System.out.println((char)i);
			}
		br.close();
		fr.close();

	}

}
