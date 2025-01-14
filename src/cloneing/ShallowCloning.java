package cloneing;

		/*if your class content any refrence variable the shallow cloning may 
		  not work properly and there is data inconsistency problem*/ 

public class ShallowCloning implements Cloneable {
	Student s;
	int id = 10;

	public ShallowCloning(Student s, int id) {
		this.s = s;
		this.id = id;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
