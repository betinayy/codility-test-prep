package com.other;

import java.util.Scanner;

public class SmallestMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("The smallest multiple of " + num + " is equal to " + getSmallestMultiple(num));
    }
    public static int gcd(int n1, int n2) {
        if (n1 % n2 != 0) return gcd(n2, n1 % n2);
        else return n2;
    }
    public static int getSmallestMultiple(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result = (result * i) / gcd(result, i);
        }
        return result;
    }
}
