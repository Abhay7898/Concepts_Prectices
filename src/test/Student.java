package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	int roll;
	String name;

	public Student(int roll, String name) {
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		Student s = new Student(101, "Abhay");
		Student s2 = new Student(102, "Ayaush");
		Student s3 = new Student(100, "Rinki");
		Student s4 = new Student(106, "golu");

		ArrayList a = new ArrayList();
		a.add(s);
		a.add(s2);
		a.add(s3);
		a.add(s4);

		 Collections.sort(a);
		System.out.println(a);

		TreeSet t = new TreeSet();
		t.add(s);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		System.out.println(t);
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return -Integer.valueOf(roll).compareTo(o.roll);
	}
}
