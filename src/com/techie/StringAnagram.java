package com.techie;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static boolean check(String a, String b) {
        if (a.length() != b.length()) return false;

        Map<Character, Integer> astr = new HashMap<>();
        Map<Character, Integer> bstr = new HashMap<>();

        for (char s : a.toCharArray()) {
            astr.put(s, astr.getOrDefault(s, 0) + 1);
        }

        for (char s : b.toCharArray()) {
            bstr.put(s, bstr.getOrDefault(s, 0) + 1);
        }

        return astr.equals(bstr);
    }

  public static void main(String[] args) {
        System.out.println(check("listen", "silent"));
        System.out.println(check("aba", "bab"));
        System.out.println(check("aaa", "aaaa"));
  }
}
