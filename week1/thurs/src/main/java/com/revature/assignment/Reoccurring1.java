package main.java.com.revature.assignment;

public class Reoccurring1 {
    public int mostRecurringInteger(String s) {
        char temp = ' ';
        int count = 1;
        int num = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (c != temp) {
                temp = c;
                count =1;

            } else count ++;

            if  (max < count) {
                max = count ;
                        num = Integer.parseInt(String.valueOf(c));
            }
        }
        return num;
    }
}
