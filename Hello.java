package com.awkhan94.zero;

import ca.roumani.i2c.Utility;

public class Hello {
    public static void main(String[] args) {
        System.out.println("The max no is: " + Math.max(10,8));
        System.out.println("The greatest common divisor is: " + Utility.gcd(24,18));
        System.out.println("The power/exponent of any given base is 2^3 = 8: " + Math.pow(2,3));
        System.out.println(Math.pow(2,10));
        /*Yes we can use pow(exponent or power) also to show the same output as sqrt of 2.*/
        System.out.println(Math.pow(2,0.5));
        System.out.println("The square root of the number is: " + Math.sqrt(2));
        System.out.println("The factorial of the number is: " + Utility.factorial(3));
        System.out.println("The greatest factor of the number is: " + Utility.gf(104));
        /* 1 meter into feet and inches are: 3 feet and 3.3701 inches*/
        System.out.println("The meter to feet and inch of the number is: " + Utility.m2FtInch(1));
    }
}
