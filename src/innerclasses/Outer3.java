package innerclasses;

public class Outer3 {
	public class Inner {
		public void m1() {
			System.out.println("Inner Class m1 method");
		}
	}

	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner i = o.new Inner();
		i.m1();

		Outer3.Inner i2 = new Outer3().new Inner();
		i2.m1();

		new Outer3().new Inner().m1();
	}
}
