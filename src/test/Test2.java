package test;

public class Test2 {
	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 2, 5, 6, 3};
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate=false;
			for (int j =i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					isDuplicate=true;
					break;
				}
			}
			if (isDuplicate) {
				boolean isPrinted=false;
				for (int j = 0; j <i; j++) {
					if (a[i]==a[j]) {
						isPrinted=true;
						break;
					}
				}
				if (!isPrinted) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
