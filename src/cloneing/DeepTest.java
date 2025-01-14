package cloneing;

public class DeepTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(1);
		DeepCloning d = new DeepCloning(s, 2);
		
		System.out.println(d.s.rollNo+"-----"+d.id);
		
		DeepCloning d1 =(DeepCloning)d.clone();
		System.out.println(d1.s.rollNo+"-----"+d1.id);
		
		d1.s.rollNo=101;
		d1.id=201;
		
		
		System.out.println(d.s.rollNo+"-----"+d.id);
		System.out.println(d1.s.rollNo+"-----"+d1.id);
	}
}
