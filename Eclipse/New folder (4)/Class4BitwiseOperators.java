package demo01;
/*Bit-wise operators 
 *  &
 *  |
 *  ^
 * >>
 * <<
 */
public class Class4BitwiseOperators {
	public static void main(String[]args) {
		int a=9,b=12;
		//a&=1,b|=2;c^=3; compound assignment
		boolean c=true,d=false;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println((byte)(a<<9));
		System.out.println(a>>12);
		System.out.println(b<<9);
		System.out.println((byte)(b>>12));
		System.out.println("(using the operator double times)"+(a>>>1));
		System.out.println("(boolean means either true or false)"+(c&d));
		System.out.println("(OR)"+(c|d));
		System.out.println("(not)"+(c^d));
	}

}
