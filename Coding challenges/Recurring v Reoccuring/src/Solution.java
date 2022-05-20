import java.util.*;

public class Solution {

    public int mostRecurringInteger(String s) {

        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> maxNum = new PriorityQueue<>();


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
            //list.iterator()
            if(maxNum.size() > 1){
                break;
            }

            else if(list.contains(k)) {
                maxNum.add(k);
                list.remove();





                //break;
            } else if(!list.contains(k)){
                j--;
                k--;

            }
            else if(maxNum.size() < 2){
                maxNum.clear();
                k--;

            }
        }

        return maxNum.peek();



    }
    }











