package com.rohi1.funcs;

import java.util.Scanner;

public class func1 {
    public static void main(String[] args) {
        //Q; take input of two sums and print the sum.
        Scanner in = new Scanner(System.in);
        int n1,n2,sum;
        System.out.println("enter the num 1:");
        n1 = in.nextInt();
        System.out.println("enter the num 2:");
        n2 = in.nextInt();
        sum=n1+n2;
        System.out.println("the sum of n1 & n2 is :"+sum);
        //similarly do this for 10 times or more than 10
        // DRY - Don't Repeat Yourself (basically in code of an any program don't repeat the code).

    }
}
