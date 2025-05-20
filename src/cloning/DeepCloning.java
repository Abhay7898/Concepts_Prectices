package cloning;

public class DeepCloning implements Cloneable {
	Student s;
	int i;

	public DeepCloning(Student s, int i) {
		this.s = s;
		this.i = i;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student s2 = new Student(s.i);
		DeepCloning d = new DeepCloning(s2, i);
		return d;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(10);

		DeepCloning d = new DeepCloning(s, 100);
		System.out.println(d.s.i + "   " + d.i);

		DeepCloning d2 = (DeepCloning) d.clone();
		System.out.println(d2.s.i+"  "+d2.i);
		
		d2.s.i=20;
		d2.i=200;
		
		System.out.println(d2.s.i+"  "+d2.i);
	}
}
