package com.revature.encapsulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem {
    public String filterUniqueChar(String s) {
        return setToString(stringToSet(s));
    }

    private Set<Character> stringToSet(String s) {
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) set.add(c);

        return set;
    }

    private String setToString(Set<Character> t) {
        String s = "";
        for(char c : t) s += c;

        return s;
    }
}
