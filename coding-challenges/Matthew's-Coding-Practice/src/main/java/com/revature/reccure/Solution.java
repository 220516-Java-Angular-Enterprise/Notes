package com.revature.reccure;

import java.util.HashMap;

public class Solution {


    //1223334444

    public int recurringInt(String s) {
        int answer = 0;
        int holder = 0;
        int counter = 1;
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                    counter++;
                    continue;
                }if (holder < counter){
                    answer = Character.getNumericValue(s.charAt(i));
                    holder = counter;
                    counter = 1;
                    continue;
                }
                counter = 1;
            }
        }else if(s.isEmpty()){
            return 0;
        }else return Integer.parseInt(s);
        return answer;
    }


    public int TotalInt(String s){
        int answer = 0;
        HashMap<Integer, Integer> reccurN = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            Integer key = Integer.valueOf(s.charAt(i));
            if (!reccurN.containsKey(key)) {
                reccurN.put(key, 1);
            }
            else reccurN.put(Integer.valueOf(s.charAt(i)), reccurN.get(key)+1);
        }

        return answer;
    }
}
