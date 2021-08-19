package com.techie;

public class MissingInArray {
    // O(n) time complexity
    public static int findMissing(int... arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

  public static void main(String[] args) {
        System.out.println(findMissing(1, 2, 3, 4, 5, 7, 8, 9, 10));
  }
}
