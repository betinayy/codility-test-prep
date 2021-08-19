package com.other;

public class SumOfNumbersString {
    public static int sumNumbers(String str) {
        String temp = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("23abgj34fjf4fjf3"));
    }
}
