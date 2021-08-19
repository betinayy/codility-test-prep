package com.techie;

public class NthFibonacci {
    public static int fib(int n) {
        int current = 1;
        int prev = 1;
        if (n <= 2) return 1;
        for (int i = 1; i < n - 1; i++) {
            int temp = current + prev;
            prev = current;
            current = temp;
        }
        return current;
    }

  public static void main(String[] args) {
    //
      System.out.println(fib(5));
      System.out.println(fib(8));
      System.out.println(fib(1));
      System.out.println(fib(2));
  }
}
