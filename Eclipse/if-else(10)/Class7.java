package demo01;
// if-else program
//nested if condition 
import java.util.Scanner;
public class Class7 {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number ");
		num=input.nextInt();
		if(num>0)
		{
			System.out.println((num)+"=the given number is positive");// if the condition is true
		}
		else if(num==0)
		{
			System.out.println((num)+"=the given number is neutral da ");
		}
		else
		{
			System.out.println((num)+"=the given number is negative ");//if the condition is false
		}
		input.close();

	}

}
