package com.revature.problem;

import java.util.HashSet;

public class UI {
    public static void main(String[] args) {
        String str = "11222111";
        str = "1223334444";
        char[] arr = str.toCharArray();
        System.out.println(firstMostRecurringInt(arr));
    }
    static char firstMostRecurringInt ( char str[]){
        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i <= str.length - 1; i++) {
            char c = str[i];

            if (h.contains(c))
                return c;

            else
                h.add(c);
        }

        return '\0';
    }
}