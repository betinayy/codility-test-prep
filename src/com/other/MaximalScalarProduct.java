package com.other;

import java.util.Arrays;

public class MaximalScalarProduct {
    public static int maxScalarProduct(int[] a, int... b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int product = 0;
        for (int i = 0; i < a.length; i++) {
            product += a[i] * b[i];
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(maxScalarProduct(new int[]{3, 5, 7, 2}, 2, 2, 1, 5));
    }
}
