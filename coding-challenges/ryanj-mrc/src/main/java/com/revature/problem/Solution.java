package com.revature.problem;

import java.util.HashSet;

public class Solution {
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
