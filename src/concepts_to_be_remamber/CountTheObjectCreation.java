package concepts_to_be_remamber;

public class CountTheObjectCreation {
	public static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		CountTheObjectCreation c = new CountTheObjectCreation();
		CountTheObjectCreation c1 = new CountTheObjectCreation();
		CountTheObjectCreation c2 = new CountTheObjectCreation();
		CountTheObjectCreation c3 = new CountTheObjectCreation();
		CountTheObjectCreation c4 = new CountTheObjectCreation();

		System.out.println(count);
	}
}
