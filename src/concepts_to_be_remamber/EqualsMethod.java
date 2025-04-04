package concepts_to_be_remamber;

import cloneing.Test;

public class EqualsMethod {

	private int rollNo;
	private String name;

	public EqualsMethod(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof EqualsMethod) {
			EqualsMethod e = (EqualsMethod) obj;
			if (rollNo == e.rollNo && name.equals(e.name)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		EqualsMethod e = new EqualsMethod(1, "Abhay");
		EqualsMethod e1 = new EqualsMethod(1, "Abhay");
		System.out.println(e.equals(e1));

		EqualsMethod e3 = null;
		System.out.println(e.equals(e3));
		System.out.println(e.equals("Abhay"));

		Test t = new Test();
		System.out.println(e.equals(t));

	}
}
