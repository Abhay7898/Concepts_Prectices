package externalization_program;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization1 implements Externalizable {
	String firstName;
	String lastName;
	int age;

	public Externalization1() {
		System.out.println("No-Arg Constructer");
	}

	public Externalization1(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(firstName);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		firstName = (String) in.readObject();
		age = in.readInt();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalization1 ex = new Externalization1("Abhay", "Garhwal", 23);
		System.out.println(ex.firstName + "  " + ex.lastName + "  " + ex.age);

		FileOutputStream fos = new FileOutputStream("D:\\Concepts_Prectices\\Externalization1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex);

		FileInputStream fis = new FileInputStream("D:\\Concepts_Prectices\\Externalization1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalization1 ex1 = (Externalization1) ois.readObject();
		System.out.println(ex1.firstName + "  " + ex1.lastName + "  " + ex1.age);

	}
}
