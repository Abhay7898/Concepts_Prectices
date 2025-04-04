package singleton;

public class SingleTon2 {
	private static SingleTon2 s = null;

	private SingleTon2() {

	}

	public static SingleTon2 getSingleTon2() {
		if (s == null) {
			s = new SingleTon2();
		}
		return s;
	}
}
