package cloning;

public class ShallowCloning implements Cloneable {
	Student s;
	int i;

	public ShallowCloning(Student s, int i) {
		this.s = s;
		this.i = i;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(10);
		ShallowCloning sc1 = new ShallowCloning(s, 100);
		System.out.println(sc1.s.i + "  " + sc1.i);

		ShallowCloning sc2 = (ShallowCloning) sc1.clone();
		System.out.println(sc2.s.i + "  " + sc2.i);
		sc2.s.i = 20;
		sc2.i = 200;

		System.out.println(sc1.s.i + "  " + sc1.i);
		System.out.println(sc2.s.i + "  " + sc2.i);
	}
}
