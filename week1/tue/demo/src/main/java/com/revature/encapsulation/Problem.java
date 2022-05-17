package com.revature.encapsulation;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem {

    /* this method is public, so it can be accessible when we instantiate the object */
    public String filterUniqueChar(String s) {
        return setToString(stringToSet(s));
    }

    /* helper functions for filterUniqueChar */
    /* only this class can access these methods because it is private */
    /* we don't want to expose these helper functions because they're purpose is to do things under the hood */

    /* the purpose of this method is to convert a string to a set */
    private Set<Character> stringToSet(String s) {

        /* the Set data structure takes in a wrapper class */
        /* wrapper classes are primitive types converted into an object */
        /* why do we do this? Because data structures only take objects as a generic */
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) set.add(c);

        return set;
    }

    /* the purpose of this method is to convert a set to a string */
    private String setToString(Set<Character> set) {
        String s = "";

        for (char c : set) s += c;

        return s;
    }
}
