package Hackkerrank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol1{

        public static int sockMerchant(int n, List<Integer> ar) {
            int pair = 0;
            int count = 0;
            Set<Integer> uniqueVals = new HashSet<>(); //Hold unique values of ar

            for(int i:ar){ // Adds ar to set;
                uniqueVals.add(i);
            }
            for (int i:uniqueVals) { //Using unique values to loop through ar
                for(int j:ar){
                    if(i==j){
                        count++;  //Count how many duplicates
                    }
                }
                pair += Math.floor(count/2); // Get pairs
                count = 0;
            }
            return pair;

        }
        //(edited)

    }


/*//sort input list
    List<Integer> sockList = ar;
    Collections.sort(sockList);
    int numPairs=0;
    //Loop through the list.
    for (int i =1; i<sockList.size(); i++){
        //If we get a match:
        if (sockList.get(i).equals(sockList.get(i-1))){
            //increment numPairs
            numPairs++;
            //increment i by an additional 1 so we do not compare twice.
            i++;
        }
    }
    return numPairs;*/

/*//sort input list
    List<Integer> sockList = ar;
    Collections.sort(sockList);
    int numPairs=0;
    //make a stack
    Stack<Integer> sockStack = new Stack<>();
    //for each element of the list:
    //if stack empty, push to stack, go to  next sock
    for (int sock : sockList){
        if(sockStack.size()==0){
            sockStack.push(sock);
            continue;
        } else {
        //else peek stack, and if sock matches, increment numPairs, pop stack,

            if (sockStack.peek().equals(sock)){
                numPairs++;
                sockStack.pop();
        //otherwise this must be a new color.  push it to stack
            }   else {
                sockStack.push(sock);
                }
        }
    }
    return numPairs; */