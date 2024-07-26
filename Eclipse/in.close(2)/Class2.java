package demo01;

import java.util.Scanner;
public class Class2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the float");
		float num1=input.nextFloat();
		System.out.println(num1);
		System.out.println("enter an long int");
		int num3=input.nextInt();
		System.out.println(num3);
		input.close();
	}

}
