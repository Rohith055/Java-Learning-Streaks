package com.rohi.ex;

import java.util.Scanner;

public class icasecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        System.out.println(in.next().trim());  //it trims the extra space int output
//        String word;
//        word = "HELLO WORLD";
//        System.out.println(word.charAt(2));    //charAt is used to print the index element given inside the parenthesis.
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("UPPER CASE");
        }
        System.out.println(ch);


    }
}
