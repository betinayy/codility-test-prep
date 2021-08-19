package com.other;

public class LargestPalindrome {
    public static boolean isPalindrome(int x) {
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
    public static int getLargestPalindrome(int N) {
        for (int i = N - 1; i >= 0; i--) {
            if (isPalindrome(i)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPalindrome(140));
    }
}
