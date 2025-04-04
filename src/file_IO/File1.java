package file_IO;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Concepts_Prectices", "File1.txt");
		System.out.println(f.exists());
		
		f.createNewFile();
		System.out.println(f.exists());
	}
}
