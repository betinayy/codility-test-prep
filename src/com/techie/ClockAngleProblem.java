package com.techie;

public class ClockAngleProblem {
    public static int angle(int hour, int min) {
        int h = (hour * 360) / 12 + (min * 360) / (12 * 60);
        int m = (min * 360) / (60);
        int angl = Math.abs(h - m);
        return angl = angl > 180  ? 360 - angl : angl;
    }

  public static void main(String[] args) {
        System.out.println(angle(5, 30));
        System.out.println(angle(9, 0));
        System.out.println(angle(12, 0));
  }
}
