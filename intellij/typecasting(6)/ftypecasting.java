package com.rohi.ex;

import java.util.Scanner;

public class ftypecasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        //type casting
//        int num = in.nextInt();
//        System.out.println(num);
        // float is the greatest data type when compared to the int .
        //ERROR int num = 98.586586; it will give only the int values .
//        similarly for all datatypes
//        System.out.println("java is an unicode");

//        int a = 257;
//        byte b = (byte)(a); // which is 257 % 256 = 1
//        System.out.println(b);
        // here the value int is been converted in to byte and stored in byte b

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c ;// here the multipe of a and b is 2000 which is divided by the value 100.
//        System.out.println(d);
//        // we cannot directly convert int into float or a any other data types

        int num = 'A';
        System.out.println(num);
// java is an unicode , here the ASCI value of A is 65.

        System.out.println(3 * 0.5);// int * float is comes as the float

        byte b = 43;
        char c = 'a';
        short s = 1024;
        int i = 500000;
        float f = 5.67f;
        double d = 0.13245;
        double res =(f * b) + (i / c) - (d * s);
        // float + int + double = double
        // here the entire result is been converted into double .
        System.out.println((f * b) +"   "+ (i / c) +"   "+ (d * s));
        System.out.println(res);



    }
}
