package com.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;

public class KSortedString {
    public static boolean isSorted(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i - 1)) return false;
        }
        return true;
    }

    public static void printStrings(int k, String... arr) {
        List<String> klen = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == k) klen.add(arr[i]);
        }
        for (String word : klen) {
            if (isSorted(word)) System.out.println(word);
        }
    }

  public static void main(String[] args) {
        String[] words = {"cat", "acr", "abcdekfj", "hat", "not"};
        printStrings(3, words);
  }
}
