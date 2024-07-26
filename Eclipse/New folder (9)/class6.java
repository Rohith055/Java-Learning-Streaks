package demo01;
//order of precedence
// complex problems in pre increment and post increment 		

public class class6 {

	public static void main(String[] args) {
		 int a=10,b=3,c,d,e,f;
		 // ++a (pre increement) changes the value of (a) to 11 and takes the value a=11;
		 //a++ (post increement) it takes the previous value 11 and it performs increement it change it into 12
		 // simple ah solanum na it performs the operation first (+ irrunthuchu na inrcement panitu assign pannum) or( a first irrunchu na assign pannitu increement pannum)
		 //a=11 + 11
		 a= ++a + a++;
		 System.out.println(a);
		 b= b++ + ++b;
		 System.out.println(b);
		 c=++a + b++;
		 System.out.println(c);//ithula previous ly calculated values ah add pannirchu ana na ethir pathathu vera )
		 
		 //problems in using and & or
		 d=5;
		// performs in binary (rendumae 1 ah irruntha 1 otherwise 0)
				 //5=0101
				 //1=0001 (&)
				 //--------
				 //    0001 (which means the result is 1 )
		 System.out.println(d&1);
		 /*EX-OR(rendumae same ah iruntha 0) and different means 1
		  * 5=0101
		  * 1=0001 (^)
		  * --------
		  *     0110
		  * (e)0101
		  * ---------
		  *     0011 (which means the result is 3 da )
		  */
		  e=5;
		  f=(e^3)^e;
		 System.out.println(f);
	}

}
