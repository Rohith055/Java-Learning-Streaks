package com.rohi.ex;

import java.util.Scanner;

public class mcalcpgm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input fro user till user press X or x
        int ans = 0;
        while (true) {
//            Take operator as input
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if( op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
//                input of two numbers
                System.out.println("Enter the number 1:");
                int n1 = in.nextInt();
                System.out.println("Enter the number 2:");
                int n2 = in.nextInt();
                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 + n2;
                }
                if (op == '*') {
                    ans = n1 + n2;
                }
                if (op == '/') {
                    if (n2 != 0){
                    ans = n1 + n2;
                    }
                }
                if (op == '%') {
                    ans = n1 + n2;
                }
            }
             else if(op == 'X' || op == 'x'){
                break;
            }
            else {
                System.out.println("INVALID OPERATION");
            }
            System.out.println(ans);
        }
    }
}
