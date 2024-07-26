package demo01;
import java.util.Scanner;
//switch statement 
// characters are should be given in the single quotes('a')
public class Class10 {

	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=input.nextInt();
		System.out.println("enter the second number:");
		b=input.nextInt();
		char operator;
			System.out.println("enter the operator:+,-,*,/,%");
			operator=input.next().charAt(0);
			
			switch(operator) {
			case '+' :
				System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case '-' :
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case'*':
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case'/':
				System.out.println(a+"/"+b+"="+(a/b));
				break;
			case'%':
				System.out.println(a+"%"+b+"="+(a%b));
				break;
			default://is default is given in the last the break statement is not needed. 
				//if it is given in between the statements it needs a break statement.
				System.out.println("the given operator is not defined");
				break;
			
				
			}
			
			input.close();
		
	}

}
