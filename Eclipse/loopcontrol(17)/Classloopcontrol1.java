package demo01;
import java.util.Scanner;
public class Classloopcontrol1 {
	// sum the numbers given by the user 

	public static void main(String[] args) {
		double n,sum=0.0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number(to stop enter a negative number): ");
		while(true){
			n=input.nextDouble();
			if(n<0.0) {
				break;
			}
			sum+=n;
			System.out.println("sum is "+sum);	
		}
input.close();
	}

}
