package com.revature.my_encapsulation;

import java.util.*;

public class Problem {

    public String filterUniqueChar(String s){
      return setToString(stringToSet(s));
    }


    public static Set<Character> stringToSet(String s) {
        Set<Character> set = new LinkedHashSet<>();

        for(char c:s.toCharArray()) set.add(c);

        return set;
    }

    private String setToString(Set<Character> set){
        String s = "";

        for (char c : set) s += c;

        return s;
    }


}
