package cloneing;

public class DeepCloning {

	Student s;
	int id;

	public DeepCloning(Student s, int id) {
		this.s = s;
		this.id = id;
	}
	
	/*if your class content any refrence variable then better to go for Deep Cloning, and may 
	  it work properly and there is no data inconsistency problem in Deep Cloning
	*/ 

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student s1 = new Student(s.rollNo);
		DeepCloning d = new DeepCloning(s1, id);
		return d;
	}
}
