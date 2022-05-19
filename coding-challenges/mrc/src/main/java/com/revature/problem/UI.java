package com.revature.problem;

public class UI {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println( sol.mostRecurringInteger("11222111") );
        System.out.println( sol.mostRecurringInteger("111222333444") );
        System.out.println( sol.mostRecurringInteger("1223334444") );
        //System.out.println( sol.mostRecurringInteger("") );
        System.out.println( sol.mostRecurringInteger("1") );
        System.out.println( sol.mostRecurringInteger("11999991188881122222211777777711") );
    }
}


/*
(2,
(1,
(4,
(0,
(1,
(7,
 */