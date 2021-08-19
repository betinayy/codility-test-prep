package com.techie;

public class FirstLastOccurrence {
    // binary search
    public static int findIndex(int target, int... nums) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (right - left) / 2;
            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }

  public static void main(String[] args) {
        System.out.println(findIndex(5, 2, 5, 5, 5, 6, 6, 8, 9, 9, 9));
  }
}
