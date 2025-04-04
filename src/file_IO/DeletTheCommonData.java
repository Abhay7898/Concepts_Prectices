package file_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeletTheCommonData {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("DeletTheCommonData.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("FileWriter1.txt"));
		String line = br1.readLine();
		
		while (line != null) {
			boolean avilable = false;

			BufferedReader br2 = new BufferedReader(new FileReader("BufferWriter1.txt"));
			String target = br2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					avilable = true;
					break;
				}
				target=br2.readLine();
			}
			if (avilable==false) {
				pw.println(line);
			}
			line=br1.readLine();
		}
		pw.flush();
	}
}
