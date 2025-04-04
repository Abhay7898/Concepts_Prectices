package concepts_to_be_remamber;

public class UseOfIsInstanceMethod {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Thread t = new Thread();
		System.out.println(Class.forName(args[0]).isInstance(t));
	}
}
