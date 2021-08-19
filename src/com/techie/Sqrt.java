package com.techie;

public class Sqrt {
    public static int fsqrt(int n) {
      int low = 1;
      int high = n;
      while (low <= high) {
          int mid = low + (high - low) / 2;
          if (mid * mid == n) return mid;
          else if (mid * mid < n) low = mid + 1;
          else high = mid - 1;
      }
      return high;
    }

  public static void main(String[] args) {
    //
      System.out.println(fsqrt(4));
      System.out.println(fsqrt(1));
      System.out.println(fsqrt(12));
  }
}
