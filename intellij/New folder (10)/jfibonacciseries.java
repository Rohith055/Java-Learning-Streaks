package com.rohi.ex;

import java.util.Scanner;

public class jfibonacciseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0,b = 1,temp;
        int count = 2;

        while(count <= n){
        temp = b ;
        b += a;// (or)b = b + a;
        a = temp;
        count++;
        }
        System.out.println(b);
    }
}
