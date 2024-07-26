package com.rohi1.funcs;

import java.util.Scanner;

public class strex4 {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
        String name1 = in.next();
    String personalized = mygreet(name1);//in this type of input the strings are been given inside the double quotes"ROHI".
        //then only the compiler understands.
        System.out.println(personalized);
    }
    static String greet(){
        String greeting = "How are you ?";
        return greeting;
    }
    private static String mygreet(String name) {
    String message = "hello:"+name;
    return message;
    }

}
