package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:/test.txt");
		if(f.createNewFile()) {
			System.out.println("file is created");
			
		}
		else
		{
			System.out.println("file already exist");
		}
		Path p=Paths.get("D:\\JAVA\\test.txt");
		boolean status;
		status=Files.isWritable(p);
		System.out.println("File is writtable?"+status);
		
		Path p1=Paths.get("D:\\JAVA\\test.txt");
		boolean status1;
		status1=Files.isReadable(p);
		System.out.println("File is Readable?"+status);
		

		String path=f.getAbsolutePath();
		System.out.println("absolute path");
	
	}

}
