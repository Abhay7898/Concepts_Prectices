package test;

public class Test {
	public static void main(String[] args) {
		long num = 91111222299991l;
		String s = String.valueOf(num);

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				} else {
					i = j;
					i--;
					break;
				}
			}
			if (count >= 4) {
				System.out.println(s.charAt(i));
			}
		}
	}
}
