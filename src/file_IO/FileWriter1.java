package file_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("FileWriter1.txt");
		f.write("Abhay Garhwal");
		f.write("\n");
		f.write("I am from Burhanpur");
		f.write("\n");
		f.write("111");
		f.write("\n");
		f.write("222");
		f.write("\n");
		f.write("333");
		f.write("\n");
		f.write("444");
		f.write("\n");
		f.write("555");
		f.write("\n");
		f.write("666");
		f.write("\n");
		f.write("777");
		f.write("\n");
		f.write("888");
		f.write("\n");
		f.write("999");
		f.write("\n");
		f.write("111");
		f.write("\n");
		f.write("222");
		f.write("\n");
		f.write("333");
		f.write("\n");
		f.write("444");
		f.write("\n");
		f.write("555");
		f.write("\n");
		f.write("666");
		f.write("\n");
		f.write("777");
		f.write("\n");
		f.write("888");
		f.write("\n");
		f.write("999");
		f.flush();
	}
}
