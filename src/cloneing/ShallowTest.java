package cloneing;

public class ShallowTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(10);
		ShallowCloning sc = new ShallowCloning(s, 20);
		System.out.println(sc.s.rollNo + "----" + sc.id);

		ShallowCloning sc1 = (ShallowCloning) sc.clone();
		System.out.println(sc1.s.rollNo + "----" + sc1.id);
		sc1.s.rollNo = 101;
		sc1.id = 201;

		System.out.println(sc.s.rollNo + "----" + sc.id);
		System.out.println(sc1.s.rollNo + "----" + sc1.id);

	}
}
