package demo01;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("what is your name");
		String num1=input.nextLine();
		System.out.println("hello"+num1);
		System.out.println("what is your roll number");
		int num2=input.nextInt();
		System.out.println("Your name is:"+num1);
		System.out.println("Your roll number"+num2);
		System.out.println("what is your age");
		int num3=input.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("Your age is:"+num3);
		input.close();

	}

}
