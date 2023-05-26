package com.example.demo.java8.consumerr;


import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        //1
        Consumer<String> c1 = s -> System.out.println(s + " is an engineer");
        c1.accept("Ram");

        Consumer<String> c2 = s -> System.out.println(s + " is from India");
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Ram");
    }
}
