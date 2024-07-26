package com.rohi.ex;

import java.util.Scanner;

public class onestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EMP_id = in.nextInt();
        String DEPT = in.next();
// nested switch statements
        // it's better way to write it much cleaner way.
        switch (EMP_id) {
            case 1 -> System.out.println("ROHI");
            case 2 -> System.out.println("RED");
            case 3 -> {
                System.out.println("dept of student no 3");
                switch (DEPT) {
                    case "it" -> System.out.println("IT DEPARTMENT");
                    case "cse" -> System.out.println("COMPUTER SCIENCE AND ENGINEERING");
                    default -> System.out.println("invalid DEPT_ID");
                }
            }
            default -> System.out.println("invalid emp_id");
        }
    }
}
