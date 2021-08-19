package com.techie;

public class Pow {
    // O(log n) time complexity
    public static int power(int n, int x) {
        if (x == 0) return 1;

        int pow = power(n, x / 2);

        if (x % 2 != 0) return n * pow * pow;
        return pow * pow;
    }

  public static void main(String[] args) {
    System.out.println(power(2, 3));
    System.out.println(power(2, 0));
  }
}
