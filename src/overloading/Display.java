package overloading;

public class Display {
	
	//in overloading all Method having same name but different argument type.
	
	public void show() {
		System.out.println("No-arg Method");
	}

	public void show(int i) {
		System.out.println("Int-arg Method " + i);
	}

	public void show(long l) {
		System.out.println("Long-Arg Method " + l);
	}

	public void show(float f) {
		System.out.println("float-Arg Method " + f);
	}

	public void show(double d) {
		System.out.println("Double-Arg Method " + d);
	}

	public void show(String s) {
		System.out.println("String-Arg Method " + s);
	}
	
	public static void main(String[] args) {
		Display d = new Display();
		d.show();
		d.show(10);
		d.show(100l);
		d.show(10.5f);
		d.show(10.10);
		d.show("Abhay");
		
	}
}
