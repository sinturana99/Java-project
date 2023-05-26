package com.example.demo.MultiThreading.basicOperationInThread;

public class ThreadPractice {
    public static void main(String[] args)
    {
        System.out.println(".......Execution started........");
        int a= 56+76;
        System.out.println("Sum is: "+a);
        //printing Thread name.....
        Thread t= Thread.currentThread();
        System.out.println("Thread is: "+t.getName());
        System.out.println("...........Execution ended......");
    }
}
