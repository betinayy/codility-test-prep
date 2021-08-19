package com.techie;

import java.nio.charset.Charset;
import java.util.stream.Collector;

public class ReverseString {
    public static String reverse(String a) {
        char[] s = a.toCharArray();
        int start = 0;
        int end = s.length - 1;

        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(s);
    }

  public static void main(String[] args) {
    System.out.println(reverse("Hello, World"));
  }
}
