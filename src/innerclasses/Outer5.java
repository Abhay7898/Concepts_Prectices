package innerclasses;

public class Outer5 {
	int x = 10;

	public class Inner5 {
		int x = 100;

		public void m5() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Inner5.this.x);
			System.out.println(Outer5.this.x);
		}
	}

	public static void main(String[] args) {
		new Outer5().new Inner5().m5();
	}
}
