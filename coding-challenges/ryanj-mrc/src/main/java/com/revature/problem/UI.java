package com.revature.problem;

import java.util.HashSet;

public class UI {
    public static void main(String[] args) {
        String str = "11222111";
        str = "1223334444";
        char[] arr = str.toCharArray();
        System.out.println(Solution.firstMostRecurringInt(arr));
    }

}