package concepts_to_be_remamber;

import java.lang.reflect.Method;

public class ClassLevelInfromations {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("java.lang.Object");
		int count = 0;
		Method m[] = c.getDeclaredMethods();
		for (Method method : m) {
			count++;
			System.out.println(method.getName());
		}
		System.out.println(count);
	}
}
