package file_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("BufferWriter1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s =br.readLine();
		while (s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
	}
}
