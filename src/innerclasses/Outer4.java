package innerclasses;

public class Outer4 {
	public class Inner4 {
		public void m4() {
			System.out.println("Inner Class");
		}
	}

	public void m() {
		System.out.println("Outer Class");
		Inner4 i = new Inner4();
		i.m4();
	}

	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.m();
	}
}
