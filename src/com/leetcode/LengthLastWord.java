package com.leetcode;

public class LengthLastWord {
    public static int len(String s) {
        int index = s.length() - 1;
        boolean isCharacter = false;
        int last = 0;
        while (index >= 0) {
            if (s.charAt(index) == ' ' && isCharacter) break;
            else if (s.charAt(index) != ' ') {
                isCharacter = true;
                last++;
            }
            index--;
        }
        return last;
    }
}
