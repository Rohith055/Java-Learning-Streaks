package demo01;
/*Shortcicuitlogicaloperators 
 * a      b       c
 * T      T       T                &&AND OPERATOR FOR SHORT CIRCUIT OPERATOR
 * T      F       F                  0=T
 * F      T       F                   1=F
 * F      F       F
 * 
 * A    B     C                  ||OR OPERATOR FOR SHORT CIRCUIT OPERATOR
 * T    T      T
 * T    F      T
 * F    T      T                         0=T
 * F    F      F                         1=F
 * 
 * IT SHOWS THE OUTPUT IN  THE BOOLEAN FORMAT
 */
public class Class4Shortcicuitlogicaloperators {
	public static void  main (String[]args) {
		int a=10;
		//                               F    -->   F   =  F    
		System.out.println((a<5)&&(a>10));
		//                              F    -->   T    =  T
		System.out.println((a<1)||(a>5));
		
		
	}

}
