package demo01;
import java.util.Scanner;
public class Class10_1 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to show week days(1-7):");
		int a1=scanner.nextInt();
		switch(a1) {
		case'1':
			System.out.println("monday");
			break;
		case'2':
			System.out.println("tuesday");
            break;
		case'3':
			System.out.println("wednesday");
			  break;
		case'4':
			System.out.println("thursday");
			  break;
		case'5':
			System.out.println("friday");
			  break;
		case'6':
			System.out.println("saturday");
			  break;
		case'7':
			System.out.println("sunday");
			  break;
		default:
			System.out.println("the given integrs doesn't contain any Week Days");
			break;
		}
		scanner.close();
	}
}