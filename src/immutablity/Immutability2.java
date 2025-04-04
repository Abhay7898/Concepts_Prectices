package immutablity;

public final class Immutability2 {

	int rollNo;
	String name;

	public Immutability2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Immutability2 Update(int rollNo, String name) {
		if (this.rollNo == rollNo && this.name.equals(name)) {
			return this;
		}
		return new Immutability2(rollNo, name);
	}


	public static void main(String[] args) {
		Immutability2 m1 = new Immutability2(1, "Abhay");
		Immutability2 m2 = new Immutability2(2, "Ayush");

		Immutability2 m3 = m1.Update(101, "Abhishek");
		Immutability2 m4 = m1.Update(1, "Abhay");

		System.out.println(m1==m3);
		System.out.println(m1==m4);

		Immutability2 m5 =m2.Update(102,"Ayushi");
		Immutability2 m6 = m2.Update(2, "Ayush");

		System.out.println(m2==m5);
		System.out.println(m2==m6);
	}
}
