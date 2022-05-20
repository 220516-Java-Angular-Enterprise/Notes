package com.revature.problem;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int mostRecurringInteger(String s) {

//        create length variable for the length of the string
        int length = s.length();

//        variable to store the index position
        int k = 0;

//        Create list to store values
        List storage = new ArrayList();

//        Allows the count to be changed
        int count = 1;
//        creates a space to hold the maximum count
        int maxCount = 0;

//        A place to store the solution
        char answer = '-';

//        create for loop to go through string and store the first recurring int.
        for (int i = 1; i < length; i++) {

//            update storage array to include charAt(i) and count
            storage.add(count);

//            look at first element in array
//            Compare to second element
//            if same, keep counting and add one to element count and update the list array
            if (s.charAt(i--) != s.charAt(i)) {
                String temp = ("\nChar: " + s.charAt(i) + " Count: " + count);
                storage.set(s.charAt(k), count);

//                Second if statement checks for the max count to be strictly higher than count
//                Sets answer to that character that came before it
                if(maxCount < count) {
                    maxCount = count;
                    answer = s.charAt(i--);
                }

//                resets count to one (since there will always be at least one and re goes through the for loop
                count = 1;

            } else {
                count++;
                k++;
            }

        }
        return answer;
    }
}
