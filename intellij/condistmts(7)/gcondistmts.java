package com.rohi.ex;
import java.util.Scanner;
public class gcondistmts {
    public static void main(String[] args) {
//        int sal;
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your current salary:");
        int sal = in.nextInt();

//        if (sal<=25000){
//            sal = sal + 2000;
//            System.out.println("your increement is :"+ sal);
//        }
//        else{
//            sal = sal + 1000;
//            System.out.println("your increement is :" +sal);
//        }
        // multiple if-else stmts
        if(sal < 15000){
            sal += 3000;
            System.out.println("your increement is :"+sal);
        }
        else if (sal==18000) {
            sal += 2000;
            System.out.println("your increement is :"+sal);
        }
        else {
            sal += 1000;
            System.out.println("your increement is :"+sal);
        }

    }
}
