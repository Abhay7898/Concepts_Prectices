package singleton;

public class SingleTon2 {
	private SingleTon2 one = null;

	private SingleTon2() {
	}

	public SingleTon2 getSingleTon2() {
		if (one == null) {
			one = new SingleTon2();
		}
		return one;
	}
}
