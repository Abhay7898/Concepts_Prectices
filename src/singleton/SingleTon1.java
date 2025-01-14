package singleton;

public class SingleTon1 {

	private static SingleTon1 one = new SingleTon1();

	private SingleTon1() {
		/* 
		 *  No one is allowed to create an object for this class because the constructor is private
		 *  No one is allowed to inherit this class
		*/
	}
	
	//this method is used to get Object of SingleTon1
	public static SingleTon1 getSingleTon1() {
		return one;
	}
}
