package file_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MargeOfTwoFileData {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("MargeOfTwoFileData.txt");

		BufferedReader bw1 = new BufferedReader(new FileReader("FileWriter1.txt"));
		String line1 = bw1.readLine();

		while ((line1 != null)) {
			pw.println(line1);
			line1 = bw1.readLine();
		}

		bw1 = new BufferedReader(new FileReader("BufferWriter1.txt"));
		line1 = bw1.readLine();
		while ((line1 != null)) {
			pw.println(line1);
			line1 = bw1.readLine();
		}

		// If we need to write alternate to the file like one line from the first file
		// and one line form the second

		BufferedReader bw2 = new BufferedReader(new FileReader("BufferWriter1.txt"));
		String line2 = bw2.readLine();
		while ((line1 != null) || (line2 != null)) {
			if (line1 != null) {
				pw.println(line1);
				line1 = bw1.readLine();
			}
			if (line2 != null) {
				pw.println(line2);
				line2 = bw2.readLine();
			}
		}

		pw.flush();

	}
}
