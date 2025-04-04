package test;

public class Test1 {
	
	public static String msg(String m) {
		System.out.println(m);
		return m;
	}

	public Test1() {
		m = msg("1");
	}

	{
		m = msg("2");
	}
	String m = msg("3");

	public void ms() {
		msg("Abhay");
	}

	public static void main(String[] args) {
		Object o = new Object();
	}
}
