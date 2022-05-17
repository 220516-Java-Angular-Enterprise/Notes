package com.revature.encapusulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem {

    // public method that gets called from object instance
    public String filterUniqueChar(String s) {
        return setToString(stringToSet(s));
    }

    // encapsulation example
    // helper functions set to private
    private Set<Character> stringToSet(String s) {
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) set.add(c);

        return set;
    }

    private String setToString(Set<Character> set) {
        String s = "";

        for (char c: set) s +=c;

        return s;
    }
}
