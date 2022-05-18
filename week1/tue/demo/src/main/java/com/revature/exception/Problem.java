package com.revature.exception;

import java.util.*;

public class Problem {
    public String filterUniqueChar(String s){

        return setToString(stringToSet(s));
    }

    //user will never be able to call these methods in the main
    //these are helper functions, encapsulation, user will never see this

    //returns a set with only unique characters
    private Set<Character> stringToSet(String s){
        Set<Character> set = new LinkedHashSet<>();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        return set;
    }

    //these methods are only visible to the current class and will only be accessed by this class
    //takes in the set we returned earlier and convert it into a string
    private String setToString(Set<Character> set){
        String s = "";
        for(char c : set){
            s+=c;
        }

        return s;

    }

}
