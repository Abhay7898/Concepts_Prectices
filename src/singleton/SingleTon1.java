package singleton;

public class SingleTon1 {
	private static SingleTon1 s = new SingleTon1();

	private SingleTon1() {

	}

	public static SingleTon1 geSinglTon1() {
		return s;
	}
}
