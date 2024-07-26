package com.rohi.ex;

public class lreversenums {
    public static void main(String[] args) {
        int n =1234;

        int ans = 0;

        while(n > 0){
            int rem = n % 10;// it stores the remainder 4 and next step it stores 3 likewise
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
//To reverse the number
// 1234    ans = 0 * 10 + rem(4) = 4
//123      ans = 4 * 10 + rem(3) = 43
//12       ans = 43 * 10 + rem(2) = 432
//1        ans = 432 * 10 + rem(1) = 4321
// simply it adds the previous answer by its dividing remainder










