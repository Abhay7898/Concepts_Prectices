package concepts_to_be_remamber;

public class UseOfNewInstanceMethod {
	public static void main(String[] args) throws Exception {
	
		// if we dont know the class name at the beegning the we used 
		Object o = Class.forName(args[0]).newInstance();
		System.out.println(o.getClass().getName());
		
		
	}
}
