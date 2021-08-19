package com.techie;

public class StringPalindrome {
    public static boolean isPalindrome(String a) {
        ReverseString rev = new ReverseString();
        String n = rev.reverse(a.toLowerCase());
        return n.equals(a.toLowerCase());
    }

  public static void main(String[] args) {
        System.out.println(isPalindrome("Abba"));
        System.out.println(isPalindrome("ABCBA"));
        System.out.println(isPalindrome("ahahah"));
  }
}
