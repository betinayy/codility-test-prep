package com.techie;

public class OddOccurence {
    /*
    The idea is to use the XOR operator.
    We know that if we XOR a number with
    itself an odd number of times, the
    result is the number itself; otherwise,
    if we XOR a number an even number of times with itself,
    the result is 0. Also, the XOR of a number with 0 is always the number itself.
     */
    public static int findOdd(int... arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

  public static void main(String[] args) {
        System.out.println(findOdd(4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3));
  }
}
