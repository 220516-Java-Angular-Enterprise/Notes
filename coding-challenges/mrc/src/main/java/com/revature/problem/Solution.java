package com.revature.problem;

import java.util.*;

public class Solution {
    public int mostRecurringInteger(String s){
        int count = 1;
        int max;
        int maxNumIndex;
        int maxNum;

        //ArrayList to hold numbers in string
        ArrayList<Integer> myArray = new ArrayList<>();

        //ArrayList to hold number of times each number occurs in a row
        ArrayList<Integer> numOccurances = new ArrayList<>();

        //ArrayList to hold just one of each number
        ArrayList<Integer> oneOfEachNum = new ArrayList<>();

        //Loops through string to type cast each character into an integer
        //adds each integer into array
        for(int i = 0; i < s.length(); i++){
            int newInt = Integer.parseInt(String.valueOf(s.charAt(i)));
            myArray.add(newInt);
        }

        //comparing elements in array with previous element
        //if equal count is incremented
        //once the number of occurrences of one individual number is counted that
        //number is added to ArrayList
        //count goes back down to 1 to begin counting occurrences of second number
        for(int i = 1; i < myArray.size(); i++){
            //Using Object.equals since I'm comparing elements from ArrayList object
            if(Objects.equals(myArray.get(i), myArray.get(i - 1))){
                count += 1;
            }else {
                numOccurances.add(count);
                oneOfEachNum.add(myArray.get(i-1));
                count = 1;
            }
        }

        //adds number of occurrences of last number to array
        numOccurances.add(count);
        //adds one of last number to array
        oneOfEachNum.add(myArray.get(myArray.size()-1));

        //finds the highest number of occurrences
        max = Collections.max(numOccurances);

        //finds the index where the max is
        maxNumIndex = numOccurances.indexOf(max);

        //gets the number that has the highest recurring count
        maxNum = oneOfEachNum.get(maxNumIndex);

        //System.out.println(myArray);
        //System.out.println(oneOfEachNum);
        //System.out.println(numOccurances);

        System.out.println(maxNum + " has the most recurring count (" + max + ")");
        return maxNum;
    }


}
