package demo01;
import java.util.Scanner;
public class class4Relativeoperator {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("a=");
	int a1=input.nextInt();
	System.out.println("b=");
	int b1=input.nextInt();
	System.out.println(a1<b1);//it gives the resuts in the format of boolean//
	System.out.println(a1>b1);
	System.out.println(a1==b1);
	System.out.println(a1!=b1);
	input.close();
	}

}
