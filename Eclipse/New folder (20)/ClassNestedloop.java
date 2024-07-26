package demo01;

public class ClassNestedloop {
//Nested loop
	public static void main(String[] args) {
		int j,i=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}

	}

}
