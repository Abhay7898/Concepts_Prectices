package immutablity;

public final class Immutability1 {

	public int i;

	public Immutability1(int i) {
		this.i = i;
	}

	public Immutability1 modify(int i) {
		if (this.i == i) {
			return this;
		}
		return new Immutability1(i);
	}

	
	
	public static void main(String[] args) {
		Immutability1 m1= new Immutability1(10);
		Immutability1 m2 = new Immutability1(100);
		
		Immutability1 m3 =m1.modify(10);
		Immutability1 m4= m2.modify(100);
		
		System.out.println(m1==m3);
		System.out.println(m1==m4);
		
		System.out.println(m2==m3);
		System.out.println(m2==m4);
		
		Immutability1 m5 =m1.modify(100);
		System.out.println(m1==m5);
		
	}
}
