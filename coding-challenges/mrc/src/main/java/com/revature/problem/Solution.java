package com.revature.problem;

import java.util.Arrays;

public class Solution {
    private int[] nums = new int[10];

    private int getMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(a[max], a[i]) == a[max] ? max : i;
        }
        return max;
    }

    public int mostRecurringInteger(String s) {
        char last;
        if(!(s.isBlank() || s.isEmpty())) {
            last = s.charAt(0);
        } else return 0;
        
        int lastNum;
        int currNum = 0;
        int maxIndex = 0;
        int maxCheck;
        int amount = 0;
        for (int i = 0; i <= s.length(); i++) {
            if(i != s.length() && (s.charAt(i) != last)) {
                currNum = s.charAt(i) - '0';
                lastNum = last - '0';
                nums[lastNum] = Math.max(nums[lastNum], amount);
                maxCheck = nums[lastNum] < nums[currNum] ? currNum : lastNum;
                maxIndex = nums[maxIndex] < nums[maxCheck] ? maxCheck : maxIndex;
                amount = 0;
                last = s.charAt(i);
            }
            else if (i == s.length()) {
                lastNum = last - '0';
                nums[lastNum] = Math.max(nums[lastNum], amount);
                maxCheck = nums[lastNum] < nums[currNum] ? currNum : lastNum;
                maxIndex = nums[maxIndex] < nums[maxCheck] ? maxCheck : maxIndex;
                break;
            }
            amount++;
        }

        return maxIndex;
    }
}
