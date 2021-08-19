package com.techie;

public class BynarySearch {
    public static int index(int target, int... nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

  public static void main(String[] args) {
      System.out.println(index(7, 2, 3, 5, 7, 9));
      System.out.println(index(2, 1, 4, 5, 8, 9));
  }
}
