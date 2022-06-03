package main;

import java.util.*;

public class main {
    public static void  main(String[] args){
        List<Integer>  test = new ArrayList<>();
        test.add(1);
        test.add(4);
        test.add(4);
        test.add(4);
        test.add(5);
        test.add(3);

        migratoryBirds(test);


    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // use map
        // if pair is in map add to app if not add to new entry
        // return count of pairs

        int anw=0;

        Map<Integer,Integer> pairs = new IdentityHashMap<>();

        for(int i : ar){
            if(pairs.containsKey(i)){
                pairs.put(i, pairs.get(i) +1);
            } else{
                pairs.put(i, 1);
            }
        }

        for (Map.Entry mapElement :pairs.entrySet()){
            int pair = (int)mapElement.getValue();
            if(pair%2== 0){
                while(pair%2 ==0){
                    anw ++;
                    pair = pair/2;
                }
            }
        }

    return anw;
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        int anw = 0;

        for(int i: a){
            if (i<= 0){
                anw++;
            }
        }

        if (anw >= k){
            return "NO";
        } else{
            return "YES";
        }

    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        List<Integer> anw = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) +1);
            } else{
                map.put(i, 1);
            }
        }

        int max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();

        for (Map.Entry mapElement :map.entrySet()){
            int count = (int)mapElement.getValue();
            if(count == max){
                anw.add((int)mapElement.getKey());
            }
        }


        int min = Integer.MAX_VALUE;

        for(int i:anw){
            if(min > i){
                min = i;
            }
        }
        return min;
    }




}








