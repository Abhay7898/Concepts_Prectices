package abstractclasses_and_interface;

public class StudentPerson1 extends Person {
	
	int roolNo;
	int marks;

	public StudentPerson1(String name, int age, int roolNo, int marks) {
		super(name, age);
		this.roolNo = roolNo;
		this.marks = marks;
	}
	
	public StudentPerson1( int roolNo, int marks) {
		super("Abhay", 10);
		this.roolNo = roolNo;
		this.marks = marks;
	}
	public static void main(String[] args) {
		StudentPerson1 sp = new StudentPerson1("Abhay",24, 101,201);
		System.out.println(sp.name);
		System.out.println(sp.age);
		System.out.println(sp.roolNo);
		System.out.println(sp.marks);
	}
}
