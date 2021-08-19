package com.techie;

public class SwapValues {
  public static void main(String[] args) {
    //
      int x = 4;
      int y = 3;
      x = x + y - (y = x);
      System.out.println(x + " " + y);
  }
}
