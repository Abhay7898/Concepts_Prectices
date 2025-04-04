package jdbc;

public class Student {
	private int roolNo;
	private String firstName;
	private String lastName;
	private String dep;
	private int age;

	public int getRoolNo() {
		return roolNo;
	}

	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
