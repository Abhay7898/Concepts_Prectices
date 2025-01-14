package test;

import java.util.ArrayList;
import java.util.Collections;

public class Test extends C {
	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A(10, 20);
		A a1 = new A(101, 230);
		A a2= new A(104, 205);
		ArrayList l = new ArrayList();
		l.add(a);
		l.add(a1);
		l.add(a2);
		Collections.sort(l);
		
	}
}
