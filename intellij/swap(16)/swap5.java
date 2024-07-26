package com.rohi1.funcs;

public class swap5 {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("Before swapping:"+a+"   "+b);
        //swap the number basicaaly it is the syntax
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);// simply it won't pass or swap the numbers.
        System.out.println("After swapping:"+a+"   "+b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
