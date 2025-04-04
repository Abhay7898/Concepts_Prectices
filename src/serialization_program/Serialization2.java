package serialization_program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization2 implements Serializable {
	int i;
	transient int j;

	public Serialization2(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serialization2 s = new Serialization2(10, 20);

		FileOutputStream fos = new FileOutputStream("D:\\Concepts_Prectices\\Serialization2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis = new FileInputStream("D:\\Concepts_Prectices\\Serialization2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialization2 s1 = (Serialization2) ois.readObject();

		System.out.println(s1.i + "   " + s1.j);
	}
}
