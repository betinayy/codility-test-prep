package com.crackingthecodinginterview;

public class FibonacciPath {
  public static void main(String[] args) {
      int n = 7;
      int current = 1;
      int prev = 0;
      System.out.print(prev + ", " + current);
      for (int i = 2; i < n; i++) {
          int temp = current + prev;
          prev = current;
          current = temp;
          System.out.print(", " + current);
      }
  }
}
