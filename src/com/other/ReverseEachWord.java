package com.other;

public class ReverseEachWord {
    public static String rev (String sentence) {
        String[] s = sentence.split(" ");
        String reversed = "";
        for (int i = 0; i < s.length; i++) {
          for (int j = s[i].length() - 1; j >= 0; j--) {
              reversed += s[i].charAt(j);
          }
          reversed += " ";
        }
        return reversed;
    }

  public static void main(String[] args) {
        System.out.println(rev("What is this"));
  }
}
