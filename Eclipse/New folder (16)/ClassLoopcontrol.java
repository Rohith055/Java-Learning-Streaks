package demo01;
import java.util.Scanner;
public class ClassLoopcontrol {
/*jump statements - break
 *  
 *  for a given n, find the nearest number divisible by 10 that is less than n
 *  57-50
 *  65-60
 *  35-30
 */
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		n=input.nextInt();
		while(n>=0) {
			if(n%10==0) {// 10 vachi divide panni remainder 0 nu vanthuchu na print pannidum 
				System.out.println(n);
				break;// break kudukalana marupadiyu athae process repeat agitu irukum.
			}// 0 varala na decreement panitu marupadiyu check pannum.
			n--;
		}
		input.close();
	}

}
