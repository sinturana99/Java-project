package com.example.demo.java8.methodReferenceUsingThread;

public class ThreadPractice {
    public static void main(String[] args)
    {
        Runnable r=()->{
            for (int i=0;i< 5;i++){
                System.out.println("Child Thread");
            }
        };
        Thread t= new Thread(r);
        t.start();
        for (int i=0;i< 5;i++){
            System.out.println("Main Thread");
        }
    }
}
