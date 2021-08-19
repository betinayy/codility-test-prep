package com.other;

public class Avarage {
    public static double avarage (int... arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println(avarage(1, 2, 3, 4, 5));
        System.out.println(avarage(2, 7, 3, 2));
    }
}
