package com.revature.problem;



import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String mostRecurringInteger(String s) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        // able to break down one by one//
        char[] ch = s.toCharArray();
        // figured out how to get correct length//
        if (ch.length>=1){
            if (ch.length<=10){
                for (int i = 0; i < ch.length; i++) {
                    charMap.put(ch[i], charMap.get(ch[i]) + 1);
                }
                }else{
                throw new ArrayIndexOutOfBoundsException("String too big");}



            }else{
                throw new ArrayIndexOutOfBoundsException("String too small");}
        System.out.println(charMap);
        return "";
    }


        }

        // Traverse the character array


/*        for (int i = 0; i < s.length(); i++) {

            // Print current character
            System.out.print(s.charAt(i) + " ");*//*
        }
        int intString = Integer.parseInt(s);
        String stringInt = String.valueOf(intString);
        System.out.println(stringInt);*/
        /*throw new RuntimeException("TODO! Needs implementation...");*/




