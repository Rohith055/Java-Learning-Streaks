package demo01;
//nested if condition 
//90-100-gradeA
//80=89-gradeB
//70-79-gradeC
//60-69-gradeD
//<50-gradeE
//
import java.util.Scanner;
public class Class8 {

	public static void main(String[] args) {
		int mark;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the mark(0-100) ");
		mark=input.nextInt();
		if(mark>=90)
			System.out.println("grade A");
		else if(mark>=80)
			System.out.println("grade B");
		else if(mark>=70)
			System.out.println("grade C");
		else if(mark>=60)
			System.out.println("grade D");
		else
			System.out.println("grade E");
		input.close();
	}

}
