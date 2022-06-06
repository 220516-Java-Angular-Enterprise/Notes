package com.revature.lambda;

import java.io.StringBufferInputStream;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        String str = "1sswed1";
        StringBuilder s = new StringBuilder(str);
        s.chars().mapToObj(i -> (char)i).filter( i-> Character.isAlphabetic(i)).toString();
        //List<Character> chars = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        //System.out.println(chars.stream().filter(i -> Character.isAlphabetic(i)).collect(Collectors.toList()).stream().count());
        //IntStream stream = IntStream.range(1,21);

        //List<Integer> primes = stream.filter(Main::isPrime)
                //.boxed().collect(Collectors.toList());

        //primes.forEach(System.out::println);

    }
    public static boolean isPrime(int i){
        IntPredicate isDivisible = index -> i%2 ==0;
        return i > 1 && IntStream.range(2,i).allMatch(isDivisible);
    }
}
