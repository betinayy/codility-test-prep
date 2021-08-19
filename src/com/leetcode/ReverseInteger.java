package com.leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        int b = 0;
        int reversed = 0;
        while (x != 0) {
            int temp = x % 10;
            reversed = b * 10 + temp;
            if ((reversed - temp) / 10 != b) return 0;
            else b = reversed;
            x /= 10;
        }
        return b;
    }

  public static void main(String[] args) {
    System.out.println(reverse(-123));
    System.out.println(reverse(1534236469));
  }
}
