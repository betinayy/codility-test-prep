package com.leetcode;

public class SearchInsertPosition {
    public static int search(int target, int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }
}
