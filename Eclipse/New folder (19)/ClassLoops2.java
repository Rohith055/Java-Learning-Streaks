package demo01;
import java.util.Scanner;
public class ClassLoops2 {

	public static void main(String[] args) {
		int i=1;
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("how many stars do you want:");
		n=input.nextInt();
		 do{
			System.out.println("*");
		    i++;
		}while(i<=n);// we can give the while after the do statement.
		 input.close();
	}
}
