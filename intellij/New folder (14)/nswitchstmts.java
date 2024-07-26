package com.rohi.ex;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class nswitchstmts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("the king of the fruits");
                break;// if break is not included all statements will been executed
            case "apple":
                System.out.println("the fruit is in red color");
                break;
            case "grapes":
                System.out.println("this is the smallest fruit");
                break;
            case "strawberry":
                System.out.println("this fruit is in red color");
                break;
            default://default goes at the end only
                System.out.println("PLEASE ENTER A VALID CHARACTER");
                break;
        }
//        switch (fruit) {
//            case "mango" -> System.out.println("the king of the fruits");
//// if break is not included all statements will been executed
//            case "apple" -> System.out.println("the fruit is in red color");
//            case "grapes" -> System.out.println("this is the smallest fruit");
//            case "strawberry" -> System.out.println("this fruit is in red color");
//            default ->//default goes at the end only
//                    System.out.println("PLEASE ENTER A VALID CHARACTER");
//        }// this is the new enhanced switch statement to acess this format press alt and select enhanced switch stmt and click on enter.
        // in this type there is no break stmt is been needed.

        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("MONDAY");
//            case 2 -> System.out.println("TUESDAY");
//            case 3 -> System.out.println("WEDNESAY");
//            case 4 -> System.out.println("THURSDAY");
//            case 5 -> System.out.println("FRIDAY");
//            case 6 -> System.out.println("SATURDAY");
//            case 7 -> System.out.println("SUNDAY");
//        }
        switch (day){
            case 1,2,3,4,5 -> System.out.println("WEEKDAYS");
            case 6,7 -> System.out.println("WEEKENDS");
        }
    }
}