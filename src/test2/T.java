package test2;

public class T {
	public static void main(String[] args) throws InterruptedException {
		My m = new My();
		m.start();
		m.join();
	}
}
