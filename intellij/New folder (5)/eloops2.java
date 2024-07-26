package com.rohi.ex;
import java.util.Scanner;
public class eloops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temp in c :");
        float temp = in.nextFloat();
        temp = (temp + 9 / 5) + 32;// this is the formula for converting temperature into celsius
        System.out.println(temp);

    }
}
