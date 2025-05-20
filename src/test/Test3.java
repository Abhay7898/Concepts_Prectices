package test;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {
		String s= "java is java and java is powerful";
		String s1[]=s.split("\\s");
		
		for (int i = 0; i <s1.length; i++) {
			int count =1;
			for (int j = i+1; j < s1.length; j++) {
				if (s1[i].equals(s1[j])) {
					count++;
				}
			}
			
			boolean isPrinted=false;
			for (int j = 0; j < i; j++) {
				if (s1[i].equals(s1[j])) {
					isPrinted=true;
					break;
				}
			}
			if (!isPrinted) {
				System.out.println(s1[i]+" "+count);
			}
		}
		
		System.out.println("Bhai Bhai     BHai Bhai");
		String s2 = "java is java and java is powerful";
        String[] words = s2.split("\\s+"); // Split by whitespace

        Map<String, Integer> wordCount = new HashMap<>();

        // Count word frequencies
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}
}
