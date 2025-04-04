package serialization_program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization1 implements Serializable {
	int no;
	String name;

	public Serialization1(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization1 s = new Serialization1(101, "Abhay");

		FileOutputStream fos = new FileOutputStream("D:\\Concepts_Prectices\\Serialization1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis = new FileInputStream("D:\\Concepts_Prectices\\Serialization1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialization1 s2 = (Serialization1) ois.readObject();
		System.out.println(s2.no + "  " + s2.name);
	}
}
