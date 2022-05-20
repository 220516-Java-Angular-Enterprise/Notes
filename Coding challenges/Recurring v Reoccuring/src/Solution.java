import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public int mostRecurringInteger(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> maxNum = new ArrayList<>();
        int i = 0;

        int k = 9;
        int parse = Integer.valueOf(s);


        Integer regex = Integer.valueOf(i);
        for (i = 0; i < parse; i++) {

            list.add(parse % 10);
            parse = parse / 10;
            if (regex == parse) {
                list.add(parse);

            } else {
                regex = Integer.valueOf(i);

            }

        }
        //seperate for loops
        for(int j = 0; j < list.size();j++) {
            if (list.contains(k)) {
                maxNum.add(k);

                break;
            } else if(!list.contains(k)){
               j--;
                k--;

            }
        }



    return maxNum.get(0);
        }
    }











