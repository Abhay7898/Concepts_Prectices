package serialization_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerialization implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	transient String password;
	
	public CustomizedSerialization(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		oos.writeObject(("123" + password));
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		password = ((String) (ois.readObject())).substring(3);
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		CustomizedSerialization c = new CustomizedSerialization("Abhay","Abhay123");
		System.out.println(c.userName+"  "+c.password);
		
		FileOutputStream fos = new FileOutputStream("D:\\Concepts_Prectices\\CustomizedSerialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		FileInputStream fis = new FileInputStream("D:\\Concepts_Prectices\\CustomizedSerialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CustomizedSerialization c1 =(CustomizedSerialization)ois.readObject();
		
		System.out.println(c1.userName+"  "+c1.password);
	}
}
