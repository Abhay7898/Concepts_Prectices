package file_IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("FileWriter1.txt");
		FileReader fr = new FileReader(f);
		
		int i = fr.read();
		while (i!=-1) {
		System.out.print((char)i);
		i=fr.read();
		}	
		System.out.println();
		System.out.println("***********************************");
		
		FileReader fr2 = new FileReader(f);
		char ch []=new char[(int)f.length()];
		fr2.read(ch);
		for (char c : ch) {
			System.out.print(c);
		}
	}
}
