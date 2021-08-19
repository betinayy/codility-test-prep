package com.other;

import java.util.Arrays;

public class Kmin {
    public static int getKmin(int k, int... arr) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        System.out.println(getKmin(4, 9, 4, 3, 12, 8, 7, 34));
    }
}
