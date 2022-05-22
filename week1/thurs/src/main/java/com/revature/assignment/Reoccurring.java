package main.java.com.revature.assignment;

import java.util.*;

public class Reoccurring {
    public String filterUniqueStr(String str) {
        int count =1;
        int newCount;
        List<Integer> list = new ArrayList<Integer>();
//1223334444
        // iterate over string, count occurrences, store reoccurrences after there is a difference
        for (int i=1; i < str.length(); i++) {
            System.out.println(i);
            System.out.println(count);
            if (list.isEmpty()) {
//                Character.getNumericValue(a)
                list.add(Character.getNumericValue(str.charAt(i-1)));// initializes list to be list = [first char, count]
                list.add(count);
                System.out.println(list);
            }

//            if (i == str.length()-1) { // if final number is equal to previous and count > list count
//                if (str.charAt(i) == str.charAt(i-1) && (count > list.get(1))) {
//                    // counting occurrences
//                    list.set(1, count); // update count
//                    list.set(0, Character.getNumericValue(str.charAt(i))); // update char
//                    System.out.println(list);
//                    break;
//                    }
//                }
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
                if (count ==1 && i < 3) {
                    list.set(1, count+1); // update first count variables
                    list.set(0, Character.getNumericValue(str.charAt(i-1)));
                    System.out.println(list);
                    continue;
                }

                continue; // will break out of continue once i does not equal i-1
            }

            if (count > list.get(1)) { // if current ct > list count and,

                list.set(1, count); // update count
                list.set(0, Character.getNumericValue(str.charAt(i-1))); // update char
                System.out.println(list);
                count = 1;
            }

            if (i == str.length()-1 && str.charAt(i) != list.get(0)) {
                System.out.println(str.charAt(i));
                if (count >= list.get(1)) {
                    list.set(1, count); // update count
                    list.set(0, Character.getNumericValue(str.charAt(i))); // update char
                    System.out.println(list);
                }
            }
        }
        return "The number " + list.get(0) + " occurs " + list.get(1) + " times.";
    }
}
