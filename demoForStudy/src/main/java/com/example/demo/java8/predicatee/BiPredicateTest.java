package com.example.demo.java8.predicatee;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args)
    {
        // BiPredicate will take two args and will return boolean value.
        BiPredicate<Integer,Integer> bp=(a,b)-> (a+b)%2==0;
        System.out.println(bp.test(4,2));
    }
}
