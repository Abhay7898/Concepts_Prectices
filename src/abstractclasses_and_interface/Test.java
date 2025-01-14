package abstractclasses_and_interface;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) { 
		StudentPerson1 s1 = new StudentPerson1(10,20);
		StudentPerson1 s2 = new StudentPerson1(100,202);
		StudentPerson1 s3 = new StudentPerson1(101,205);
		StudentPerson1 s4 = new StudentPerson1(140,250);
		StudentPerson1 s5 = new StudentPerson1(105,250);
		StudentPerson1 s6 = new StudentPerson1(170,208);
		
		ArrayList l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		Collections.sort(l);
		System.out.println(l);
		
	}
}
