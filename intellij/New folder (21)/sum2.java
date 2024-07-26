package com.rohi1.funcs;

import java.util.Scanner;

public class sum2 {
    static int  sum2(){
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.println("enter the num 1:");
        n1 = in.nextInt();
        System.out.println("enter the num 2:");
        n2 = in.nextInt();
        sum=n1+n2;
        return sum;//return means the function is over
        // simply said by your work is been over here just come back.
    }

        // pass the value of numbers when you are calling the method in main()
        static int sum3(int a,int b){
        int sum = a + b;
        return sum;
        }
//     static void sum(){
//        Scanner in = new Scanner(System.in);
//        int n1,n2,sum;
//        System.out.println("enter the num 1:");
//        n1 = in.nextInt();
//        System.out.println("enter the num 2:");
//        n2 = in.nextInt();
//        sum=n1+n2;
//        System.out.println("the sum of n1 & n2 is :"+sum);
//    }
    public static void main(String[] args) {
//       int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(14,16);//don't write it as a:14,b:16; write it as its order ex(14,16) it automatically assumes the values of a and b.
        System.out.println(ans);
        }
}

