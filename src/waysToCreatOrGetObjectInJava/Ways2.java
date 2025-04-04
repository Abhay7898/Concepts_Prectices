package waysToCreatOrGetObjectInJava;

public class Ways2 {
	//by using newInstance method 
	public static void main(String[] args)throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Ways2 w = (Ways2) Class.forName("Ways2").newInstance(); 
	}
}
