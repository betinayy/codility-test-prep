package com.leetcode;

public class LongestCommonPrefix {
    public static String findLongestPrefix(String... strs) {
        if (strs.length == 0 || strs == null) return "";
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strs.length; res.append(strs[0].charAt(i++))) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) return res.toString();
            }
        }
        return res.toString();
    }
}
