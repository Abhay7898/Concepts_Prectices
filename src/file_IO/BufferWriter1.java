package file_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("BufferWriter1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Ayush Gorakhpuriya");
		bw.newLine();
		bw.write("444");
		bw.newLine();
		bw.write("555");
		bw.newLine();
		
		bw.newLine();
		bw.flush();

	}
}
