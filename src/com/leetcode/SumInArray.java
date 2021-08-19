package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// hashing
// O(n) time complexity
public class SumInArray {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp = (Integer)target - nums[i];
            if (map.containsKey(temp))
                return new int[] {i, map.get(temp)};
            map.put(nums[i], i);
        }
        return null;
    }
}
