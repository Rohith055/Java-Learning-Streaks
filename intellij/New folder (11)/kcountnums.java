package com.rohi.ex;

public class kcountnums {
    public static void main(String[] args) {
        int n = 154555;


        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n /= 10;
//            System.out.println(count);
        }
        System.out.println(count);

    }
}
// simply it divide the given number for ex 153535
//it divides it by 10 and the remainder == 5 means it increase the count value 0 to 1
//153535 % 10 = 15353 : count(5) = 1
//15353 % 10 = 1535   : count(5) = 1
//1535 % 10 =153      : count(5) = 2
//153 % 10 =15        : count(5) = 2
//15 % 10 =1          : count(5) = 3
//1 % 10 = 0
// the it prints the value of count and exit the loop