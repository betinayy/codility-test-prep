package com.leetcode;

public class PalindromeNumber {
    public static boolean palindrome(int x) {
        if (x >= 0 && x < 10) return true;
        if (x > -10 && x < 0) return false;
        int number = x;
        int a, b = 0;
        do {
            a = number % 10;
            b = b * 10 + a;
            number /= 10;
        }
        while(number > 0);

        return x == b;
    }
    public static void main(String[] args){

    }
}
