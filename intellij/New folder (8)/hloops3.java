package com.rohi.ex;
import java.util.Scanner;
public class hloops3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //q = print numbers 1 to 5
//        for(int num = 1;num<=5;num+=1){
//            System.out.println(num);
//    }
            //print numbers 1 to n
//
//        //similarly we can run this on using the while loop
//        int n=1,i=1;
//        System.out.println("enter the numbers you wnt to print");
//        n=in.nextInt();
//        while (i<=n){
//            System.out.println(i);
//            i++;
//      }
//while loop is nothing but it is the parts of for loop which is been given separately.
            //similarly for do-while loop also
            int n,j=1;
        System.out.println("enter the number");
        n=in.nextInt();
            do{
                System.out.println(j);
                j++;
            }while (j<=n);
            }
        }

