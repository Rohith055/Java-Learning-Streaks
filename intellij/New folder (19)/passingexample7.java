package com.rohi1.funcs;

public class passingexample7 {
    public static void main(String[] args) {
        String name="rohith ";
        greet(name);
    }
    public static void greet(String naam){

        System.out.println(naam);
    }
}
//in internally the access specifier greet calls the value of the reference variable name
//and it assigns it to naam.from the already declared name of string datatype.
// in java there is no pass by reference it has only pass by value.


