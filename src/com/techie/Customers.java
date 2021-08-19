package com.techie;

import java.util.HashSet;
import java.util.Set;

public class Customers {
    public static int findCustomers(String a, int capacity) {
        int counter = 0;
        Set<Character> visited = new HashSet<>();
        Set<Character> allocated = new HashSet<>();
        for (char i : a.toCharArray()) {
            if (!visited.contains(i)) {
                visited.add(i);
                if (allocated.size() < capacity) {
                  allocated.add(i);
                } else {
                    counter++;
                }
            } else {
                visited.remove(i);
                allocated.remove(i);
            }
        }
        return counter;
    }

  public static void main(String[] args) {
      String sequence = "ABCDDCEFFEBGAG";
      int capacity = 3;

      System.out.println(findCustomers(sequence, capacity));
  }
}
